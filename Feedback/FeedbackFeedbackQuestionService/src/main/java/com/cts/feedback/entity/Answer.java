package com.cts.feedback.entity;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-04-02T10:12:15.768+05:30[Asia/Calcutta]")
public class Answer {
	@Id
	@JsonProperty("id")
	private Integer id;

	@JsonProperty("answer")
	private String answer = null;

	@JsonProperty("question_id")
	private Integer questionId = null;

	public Answer id(Integer id) {
		this.id = id;
		return this;
	}
	
	@ApiModelProperty(value = "")

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Answer answer(String answer) {
		this.answer = answer;
		return this;
	}

	@ApiModelProperty(value = "")

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Answer questionsId(Integer questionId) {
		this.questionId = questionId;
		return this;
	}

	@ApiModelProperty(value = "")

	public Integer getQuestionsId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Answer answer = (Answer) o;
		return Objects.equals(this.id, answer.id) && Objects.equals(this.answer, answer.answer)
				&& Objects.equals(this.questionId, answer.questionId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, answer, questionId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Answers {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    answers: ").append(toIndentedString(answer)).append("\n");
		sb.append("    questionsId: ").append(toIndentedString(questionId)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
