package com.cts.feedback.entity;

import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;


@Validated
@Table("event")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-15T09:06:38.313+05:30[Asia/Calcutta]")
public class Event {
	@Id
	@JsonProperty("id")
	private Integer id = null;

	@JsonProperty("event_id")
	private String eventId = null;

	@JsonProperty("month")
	private String month = null;

	@JsonProperty("base_location")
	private String baseLocation = null;

	@JsonProperty("beneficiary_name")
	private String beneficiaryName = null;

	@JsonProperty("venue_address")
	private String venueAddress = null;

	@JsonProperty("council_name")
	private String councilName = null;

	@JsonProperty("project")
	private String project = null;

	@JsonProperty("category")
	private String category = null;

	@JsonProperty("event_name")
	private String eventName = null;

	@JsonProperty("event_description")
	private String eventDescription = null;

	@JsonProperty("event_date")
	private LocalDate eventDate = null;

	@JsonProperty("total_no_of_volunteers")
	private Integer totalNoOfVolunteers = null;

	@JsonProperty("total_volunteer_hours")
	private Integer totalVolunteerHours = null;

	@JsonProperty("total_travel_hours")
	private Integer totalTravelHours = null;

	@JsonProperty("overall_volunteer_hours")
	private Integer overallVolunteerHours = null;

	@JsonProperty("lives_impacted")
	private Integer livesImpacted = null;

	@JsonProperty("activity_type")
	private Integer activityType = null;

	@JsonProperty("status")
	private String status = null;

	@JsonProperty("poc_id")
	private Integer pocId = null;

	@JsonProperty("poc_name")
	private String pocName = null;

	@JsonProperty("poc_contact")
	private Long pocContact = null;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Event eventId(String eventId) {
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
	public Event month(String month) {
		this.month = month;
		return this;
	}

	
	@ApiModelProperty(value = "")

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Event baseLocation(String baseLocation) {
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

	public Event beneficiaryName(String beneficiaryName) {
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

	public Event venueAddress(String venueAddress) {
		this.venueAddress = venueAddress;
		return this;
	}

	@ApiModelProperty(value = "")

	public String getVenueAddress() {
		return venueAddress;
	}

	public void setVenueAddress(String venueAddress) {
		this.venueAddress = venueAddress;
	}

	public Event councilName(String councilName) {
		this.councilName = councilName;
		return this;
	}

	@ApiModelProperty(value = "")

	public String getCouncilName() {
		return councilName;
	}

	public void setCouncilName(String councilName) {
		this.councilName = councilName;
	}

	public Event project(String project) {
		this.project = project;
		return this;
	}

	@ApiModelProperty(value = "")

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public Event category(String category) {
		this.category = category;
		return this;
	}


	@ApiModelProperty(value = "")

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Event eventName(String eventName) {
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

	public Event eventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
		return this;
	}

	@ApiModelProperty(value = "")

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public Event eventDate(LocalDate eventDate) {
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

	public Event totalNoOfVolunteers(Integer totalNoOfVolunteers) {
		this.totalNoOfVolunteers = totalNoOfVolunteers;
		return this;
	}

	@ApiModelProperty(value = "")

	public Integer getTotalNoOfVolunteers() {
		return totalNoOfVolunteers;
	}

	public void setTotalNoOfVolunteers(Integer totalNoOfVolunteers) {
		this.totalNoOfVolunteers = totalNoOfVolunteers;
	}

	public Event totalVolunteerHours(Integer totalVolunteerHours) {
		this.totalVolunteerHours = totalVolunteerHours;
		return this;
	}

	
	@ApiModelProperty(value = "")

	public Integer getTotalVolunteerHours() {
		return totalVolunteerHours;
	}

	public void setTotalVolunteerHours(Integer totalVolunteerHours) {
		this.totalVolunteerHours = totalVolunteerHours;
	}

	public Event totalTravelHours(Integer totalTravelHours) {
		this.totalTravelHours = totalTravelHours;
		return this;
	}

	@ApiModelProperty(value = "")

	public Integer getTotalTravelHours() {
		return totalTravelHours;
	}

	public void setTotalTravelHours(Integer totalTravelHours) {
		this.totalTravelHours = totalTravelHours;
	}

	public Event overallVolunteerHours(Integer overallVolunteerHours) {
		this.overallVolunteerHours = overallVolunteerHours;
		return this;
	}

	@ApiModelProperty(value = "")

	public Integer getOverallVolunteerHours() {
		return overallVolunteerHours;
	}

	public void setOverallVolunteerHours(Integer overallVolunteerHours) {
		this.overallVolunteerHours = overallVolunteerHours;
	}

	public Event livesImpacted(Integer livesImpacted) {
		this.livesImpacted = livesImpacted;
		return this;
	}

	@ApiModelProperty(value = "")

	public Integer getLivesImpacted() {
		return livesImpacted;
	}

	public void setLivesImpacted(Integer livesImpacted) {
		this.livesImpacted = livesImpacted;
	}

	public Event activityType(Integer activityType) {
		this.activityType = activityType;
		return this;
	}

	@ApiModelProperty(value = "")

	public Integer getActivityType() {
		return activityType;
	}

	public void setActivityType(Integer activityType) {
		this.activityType = activityType;
	}

	public Event status(String status) {
		this.status = status;
		return this;
	}

	@ApiModelProperty(value = "")

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Event pocId(Integer pocId) {
		this.pocId = pocId;
		return this;
	}

	@ApiModelProperty(value = "")

	public Integer getPocId() {
		return pocId;
	}

	public void setPocId(Integer pocId) {
		this.pocId = pocId;
	}

	public Event pocName(String pocName) {
		this.pocName = pocName;
		return this;
	}

	@ApiModelProperty(value = "")

	public String getPocName() {
		return pocName;
	}

	public void setPocName(String pocName) {
		this.pocName = pocName;
	}

	public Event pocContact(Long pocContact) {
		this.pocContact = pocContact;
		return this;
	}

	@ApiModelProperty(value = "")

	public Long getPocContact() {
		return pocContact;
	}

	public void setPocContact(Long pocContact) {
		this.pocContact = pocContact;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activityType == null) ? 0 : activityType.hashCode());
		result = prime * result + ((baseLocation == null) ? 0 : baseLocation.hashCode());
		result = prime * result + ((beneficiaryName == null) ? 0 : beneficiaryName.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((councilName == null) ? 0 : councilName.hashCode());
		result = prime * result + ((eventDate == null) ? 0 : eventDate.hashCode());
		result = prime * result + ((eventDescription == null) ? 0 : eventDescription.hashCode());
		result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
		result = prime * result + ((eventName == null) ? 0 : eventName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((livesImpacted == null) ? 0 : livesImpacted.hashCode());
		result = prime * result + ((month == null) ? 0 : month.hashCode());
		result = prime * result + ((overallVolunteerHours == null) ? 0 : overallVolunteerHours.hashCode());
		result = prime * result + ((pocContact == null) ? 0 : pocContact.hashCode());
		result = prime * result + ((pocId == null) ? 0 : pocId.hashCode());
		result = prime * result + ((pocName == null) ? 0 : pocName.hashCode());
		result = prime * result + ((project == null) ? 0 : project.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((totalNoOfVolunteers == null) ? 0 : totalNoOfVolunteers.hashCode());
		result = prime * result + ((totalTravelHours == null) ? 0 : totalTravelHours.hashCode());
		result = prime * result + ((totalVolunteerHours == null) ? 0 : totalVolunteerHours.hashCode());
		result = prime * result + ((venueAddress == null) ? 0 : venueAddress.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (activityType == null) {
			if (other.activityType != null)
				return false;
		} else if (!activityType.equals(other.activityType))
			return false;
		if (baseLocation == null) {
			if (other.baseLocation != null)
				return false;
		} else if (!baseLocation.equals(other.baseLocation))
			return false;
		if (beneficiaryName == null) {
			if (other.beneficiaryName != null)
				return false;
		} else if (!beneficiaryName.equals(other.beneficiaryName))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (councilName == null) {
			if (other.councilName != null)
				return false;
		} else if (!councilName.equals(other.councilName))
			return false;
		if (eventDate == null) {
			if (other.eventDate != null)
				return false;
		} else if (!eventDate.equals(other.eventDate))
			return false;
		if (eventDescription == null) {
			if (other.eventDescription != null)
				return false;
		} else if (!eventDescription.equals(other.eventDescription))
			return false;
		if (eventId == null) {
			if (other.eventId != null)
				return false;
		} else if (!eventId.equals(other.eventId))
			return false;
		if (eventName == null) {
			if (other.eventName != null)
				return false;
		} else if (!eventName.equals(other.eventName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (livesImpacted == null) {
			if (other.livesImpacted != null)
				return false;
		} else if (!livesImpacted.equals(other.livesImpacted))
			return false;
		if (month == null) {
			if (other.month != null)
				return false;
		} else if (!month.equals(other.month))
			return false;
		if (overallVolunteerHours == null) {
			if (other.overallVolunteerHours != null)
				return false;
		} else if (!overallVolunteerHours.equals(other.overallVolunteerHours))
			return false;
		if (pocContact == null) {
			if (other.pocContact != null)
				return false;
		} else if (!pocContact.equals(other.pocContact))
			return false;
		if (pocId == null) {
			if (other.pocId != null)
				return false;
		} else if (!pocId.equals(other.pocId))
			return false;
		if (pocName == null) {
			if (other.pocName != null)
				return false;
		} else if (!pocName.equals(other.pocName))
			return false;
		if (project == null) {
			if (other.project != null)
				return false;
		} else if (!project.equals(other.project))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (totalNoOfVolunteers == null) {
			if (other.totalNoOfVolunteers != null)
				return false;
		} else if (!totalNoOfVolunteers.equals(other.totalNoOfVolunteers))
			return false;
		if (totalTravelHours == null) {
			if (other.totalTravelHours != null)
				return false;
		} else if (!totalTravelHours.equals(other.totalTravelHours))
			return false;
		if (totalVolunteerHours == null) {
			if (other.totalVolunteerHours != null)
				return false;
		} else if (!totalVolunteerHours.equals(other.totalVolunteerHours))
			return false;
		if (venueAddress == null) {
			if (other.venueAddress != null)
				return false;
		} else if (!venueAddress.equals(other.venueAddress))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", eventId=" + eventId + ", month=" + month + ", baseLocation=" + baseLocation
				+ ", beneficiaryName=" + beneficiaryName + ", venueAddress=" + venueAddress + ", councilName="
				+ councilName + ", project=" + project + ", category=" + category + ", eventName=" + eventName
				+ ", eventDescription=" + eventDescription + ", eventDate=" + eventDate + ", totalNoOfVolunteers="
				+ totalNoOfVolunteers + ", totalVolunteerHours=" + totalVolunteerHours + ", totalTravelHours="
				+ totalTravelHours + ", overallVolunteerHours=" + overallVolunteerHours + ", livesImpacted="
				+ livesImpacted + ", activityType=" + activityType + ", status=" + status + ", pocId=" + pocId
				+ ", pocName=" + pocName + ", pocContact=" + pocContact + "]";
	}

}