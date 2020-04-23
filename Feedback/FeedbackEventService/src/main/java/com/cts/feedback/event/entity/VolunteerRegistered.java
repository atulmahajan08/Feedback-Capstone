package com.cts.feedback.event.entity;

import java.time.LocalDate;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;


@Validated
@Table("volunteer_reg")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-25T09:06:38.313+05:30[Asia/Calcutta]")
public class VolunteerRegistered   {
	@JsonProperty("id")
	@Id
	private Integer id = null;
	
  @JsonProperty("event_id")
  private String eventId = null;

  @JsonProperty("event_name")
  private String eventName = null;

  @JsonProperty("beneficiary_name")
  private String beneficiaryName = null;

  @JsonProperty("base_location")
  private String baseLocation = null;

  @JsonProperty("event_date")
  private LocalDate eventDate = null;

  @JsonProperty("employee_id")
  private Long employeeId = null;

  public VolunteerRegistered eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  @ApiModelProperty(value = "")
  
    public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public VolunteerRegistered eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

  @ApiModelProperty(value = "")
  
    public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public VolunteerRegistered beneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
    return this;
  }

  @ApiModelProperty(value = "")
  
    public String getBeneficiaryName() {
    return beneficiaryName;
  }

  public void setBeneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
  }

  public VolunteerRegistered baseLocation(String baseLocation) {
    this.baseLocation = baseLocation;
    return this;
  }

  @ApiModelProperty(value = "")
  
    public String getBaseLocation() {
    return baseLocation;
  }

  public void setBaseLocation(String baseLocation) {
    this.baseLocation = baseLocation;
  }

  public VolunteerRegistered eventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
    return this;
  }


  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getEventDate() {
    return eventDate;
  }

  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }

  public VolunteerRegistered employeeId(Long employeeId) {
    this.employeeId = employeeId;
    return this;
  }

  @ApiModelProperty(value = "")
  
    public Long getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Long employeeId) {
    this.employeeId = employeeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolunteerRegistered volunteerRegistered = (VolunteerRegistered) o;
    return Objects.equals(this.eventId, volunteerRegistered.eventId) &&
        Objects.equals(this.eventName, volunteerRegistered.eventName) &&
        Objects.equals(this.beneficiaryName, volunteerRegistered.beneficiaryName) &&
        Objects.equals(this.baseLocation, volunteerRegistered.baseLocation) &&
        Objects.equals(this.eventDate, volunteerRegistered.eventDate) &&
        Objects.equals(this.employeeId, volunteerRegistered.employeeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventName, beneficiaryName, baseLocation, eventDate, employeeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolunteerRegistered {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    beneficiaryName: ").append(toIndentedString(beneficiaryName)).append("\n");
    sb.append("    baseLocation: ").append(toIndentedString(baseLocation)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
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
