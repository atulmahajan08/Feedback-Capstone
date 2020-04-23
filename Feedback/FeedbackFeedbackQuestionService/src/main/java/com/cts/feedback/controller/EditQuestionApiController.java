package com.cts.feedback.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.cts.feedback.entity.Answer;
import com.cts.feedback.entity.Question;
import com.cts.feedback.repository.AnswersRepository;
import com.cts.feedback.repository.QuestionsRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.cts.feedback.entity.*;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-04-02T10:12:15.340+05:30[Asia/Calcutta]")
@Controller
@CrossOrigin("http://localhost:3000")
public class EditQuestionApiController implements EditQuestionApi {

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public EditQuestionApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	@Override
	public Optional<ObjectMapper> getObjectMapper() {
		return Optional.ofNullable(objectMapper);
	}

	@Override
	public Optional<HttpServletRequest> getRequest() {
		return Optional.ofNullable(request);
	}

	@Autowired
	private DatabaseClient databaseClient;

	@Autowired
	private QuestionsRepository questRepository;

	@Autowired
	private AnswersRepository ansRepository;

	public Flux<ResponseEntity<FeedbackQuestions>> getFeedbackQuestions() {
		return databaseClient.execute(
				"SELECT a.id,question,fb_type, COUNT(b.answer) AS tot_ans FROM question a INNER JOIN answer b WHERE a.id = b.question_id  GROUP BY a.id")
				.as(FeedbackQuestions.class).fetch().all().map(fb_list -> ResponseEntity.ok(fb_list))
				.defaultIfEmpty(ResponseEntity.status(HttpStatus.NOT_FOUND).build()).log();
	}

	@Override
	public Flux<ResponseEntity<Question>> getAllQuestion() {
		return questRepository.findAll().map(que -> ResponseEntity.ok().body(que))
				.defaultIfEmpty(ResponseEntity.status(HttpStatus.NOT_FOUND).build()).log();

	}
	
	@Override
	public Mono<ResponseEntity<Question>> getQuestion(@PathVariable("questionId") Integer questionId) {
		return questRepository.findById(questionId).map(que -> ResponseEntity.ok().body(que))
				.defaultIfEmpty(ResponseEntity.status(HttpStatus.NOT_FOUND).build()).log();

	}

	@Override
	public Flux<ResponseEntity<Answer>> getAnswers(@PathVariable("qnId") Integer questionId) {
		return databaseClient.execute("SELECT * FROM fms.answer where question_id= " + questionId).as(Answer.class)
				.fetch().all().map(ans -> ResponseEntity.ok(ans))
				.defaultIfEmpty(ResponseEntity.status(HttpStatus.NOT_FOUND).build()).log();
	}

	@Override
	public Mono<ResponseEntity<Void>> updateQuestion(@Valid @RequestBody Question question,
			@PathVariable("questionId") Integer questionId) {
		return questRepository.save(question).map(updatedQn -> ResponseEntity.noContent().<Void>build())
				.defaultIfEmpty(ResponseEntity.notFound().build()).log();

	}

	@Override
	public Flux<ResponseEntity<Answer>> updateAnswers(@Valid @RequestBody List<Answer> answers) {
		System.err.println(answers);
		return ansRepository.saveAll(answers).map(updatedAns -> new ResponseEntity<>(updatedAns, HttpStatus.CREATED));

	}

	@Override
	public Mono<ResponseEntity<Void>> deleteQuestion (@PathVariable(value = "questionId") Integer questionId) {
		return ansRepository.deleteByQuestionId(questionId).and(questRepository.deleteById(questionId))
				.then(Mono.just(ResponseEntity.ok().<Void>build())).defaultIfEmpty(ResponseEntity.notFound().build());
	}
	

	@Override
	public Flux<ResponseEntity<Void>> deleteAllAnswers(@Valid @RequestBody List<Answer> body) {

		Flux<Answer> daoFlux = Flux.just(body).flatMap(Flux::fromIterable);

		return daoFlux.flatMap(ans -> ansRepository.delete(ans).retry(body.size()))
				.map(user -> ResponseEntity.noContent().<Void>build()).defaultIfEmpty(ResponseEntity.notFound().build())
				.log();

	}

}
