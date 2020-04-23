package com.cts.feedback.entity;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;


@Component
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-06T15:35:34.885+05:30[Asia/Calcutta]")
public class User {
	@Id
	@JsonProperty("id")
	private Integer id = null;

	@JsonProperty("firstname")
	private String firstname = null;

	@JsonProperty("lastname")
	private String lastname = null;

	@JsonProperty("emp_id")
	private String empId = null;

	@JsonProperty("password")
	private String password = null;

	@JsonProperty("role")
	private String role = null;

	public User role(String role) {
		this.role = role;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User id(Integer id) {
		this.id = id;
		return this;
	}


	@ApiModelProperty(required = true, value = "")
	@NotNull

	public Integer getId() {
		return id;
	}

	public void setId(Integer Id) {
		this.id = Id;
	}

	public User firstname(String firstname) {
		this.firstname = firstname;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public User lastname(String lastname) {
		this.lastname = lastname;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public User empId(String empId) {
		this.empId = empId;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public User password(String password) {
		this.password = password;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		User user = (User) o;
		return Objects.equals(this.id, user.id) && Objects.equals(this.firstname, user.firstname)
				&& Objects.equals(this.lastname, user.lastname) && Objects.equals(this.empId, user.empId)
				&& Objects.equals(this.password, user.password) && Objects.equals(this.role, user.role);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, firstname, lastname, empId, password, role);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class User {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
		sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
		sb.append("    empId: ").append(toIndentedString(empId)).append("\n");
		sb.append("    password: ").append(toIndentedString(password)).append("\n");
		sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
