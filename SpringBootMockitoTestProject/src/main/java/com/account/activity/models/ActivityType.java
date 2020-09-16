package com.account.activity.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "activity_type")
public class ActivityType {
	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "act_type", nullable = false)
	private String activityType;

	@JsonManagedReference
	@OneToOne(mappedBy = "activityType", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Activity activity;

	@JsonBackReference
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "act_master_id", nullable = false)
	private ActivityMaster activityMaster;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public ActivityMaster getActivityMaster() {
		return activityMaster;
	}

	public void setActivityMaster(ActivityMaster activityMaster) {
		this.activityMaster = activityMaster;
	}

}
