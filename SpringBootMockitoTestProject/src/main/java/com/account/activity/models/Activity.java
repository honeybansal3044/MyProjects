package com.account.activity.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "activity")
public class Activity {

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "act_name", nullable = false)
	private String activityName;

	@OneToOne(fetch = FetchType.EAGER)
	@JsonBackReference
	@JoinColumn(name = "act_type_id", nullable = false)
	private ActivityType activityType;

	@JsonManagedReference
	@OneToOne(mappedBy = "activity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private AccountActivityRelation accountActivityRelation;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "act_master_id", nullable = false)
	private ActivityMaster activityMaster;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public ActivityType getActivityType() {
		return activityType;
	}

	public void setActivityType(ActivityType activityType) {
		this.activityType = activityType;
	}

	public ActivityMaster getActivityMaster() {
		return activityMaster;
	}

	public void setActivityMaster(ActivityMaster activityMaster) {
		this.activityMaster = activityMaster;
	}

}
