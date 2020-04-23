package com.cts.feedback.entity;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-04-02T10:12:15.768+05:30[Asia/Calcutta]")
public class Question {
	@JsonProperty("id")
	@Id
	private Integer id = null;

	@JsonProperty("question")
	private String question = null;

	@JsonProperty("fb_type")
	private String fbType = null;

	public Question id(Integer id) {
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

	public Question question(String question) {
		this.question = question;
		return this;
	}

	@ApiModelProperty(value = "")

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Question fbType(String fbType) {
		this.fbType = fbType;
		return this;
	}

	@ApiModelProperty(value = "")

	public String getFbType() {
		return fbType;
	}

	public void setFbType(String fbType) {
		this.fbType = fbType;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Question questions = (Question) o;
		return Objects.equals(this.id, questions.id) && Objects.equals(this.question, questions.question)
				&& Objects.equals(this.fbType, questions.fbType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, question, fbType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Questions {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    question: ").append(toIndentedString(question)).append("\n");
		sb.append("    fbType: ").append(toIndentedString(fbType)).append("\n");
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
