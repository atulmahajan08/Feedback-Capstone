package com.cts.feedback.entity;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;


@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-04-02T10:12:15.768+05:30[Asia/Calcutta]")
public class NotParticipatedFeedBack   {
  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("event_event_id")
  private String eventEventId = null;

  public NotParticipatedFeedBack comment(String comment) {
    this.comment = comment;
    return this;
  }

  @ApiModelProperty(value = "")
  
    public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public NotParticipatedFeedBack eventEventId(String eventEventId) {
    this.eventEventId = eventEventId;
    return this;
  }

   @ApiModelProperty(value = "")
  
    public String getEventEventId() {
    return eventEventId;
  }

  public void setEventEventId(String eventEventId) {
    this.eventEventId = eventEventId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotParticipatedFeedBack notParticipatedFeedBack = (NotParticipatedFeedBack) o;
    return Objects.equals(this.comment, notParticipatedFeedBack.comment) &&
        Objects.equals(this.eventEventId, notParticipatedFeedBack.eventEventId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, eventEventId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotParticipatedFeedBack {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    eventEventId: ").append(toIndentedString(eventEventId)).append("\n");
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
