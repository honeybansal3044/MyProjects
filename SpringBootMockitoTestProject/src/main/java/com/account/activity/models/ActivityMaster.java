package com.account.activity.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "activity_master")
public class ActivityMaster {

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(name = "account", nullable = false)
	private Account account;

	@JsonManagedReference
	@OneToOne(mappedBy = "activityMaster", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private ActivityType activityType;

	@JsonManagedReference
	@OneToOne(mappedBy = "activityMaster", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private AccountActivityRelation accountActivityRelation;

	@JsonManagedReference
	@OneToMany(mappedBy = "activityMaster", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Activity> activity = new ArrayList<Activity>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public ActivityType getActivityType() {
		return activityType;
	}

	public void setActivityType(ActivityType activityType) {
		this.activityType = activityType;
	}

	public AccountActivityRelation getAccountActivityRelation() {
		return accountActivityRelation;
	}

	public void setAccountActivityRelation(AccountActivityRelation accountActivityRelation) {
		this.accountActivityRelation = accountActivityRelation;
	}

	public List<Activity> getActivity() {
		return activity;
	}

	public void setActivity(List<Activity> activity) {
		this.activity = activity;
	}
}
