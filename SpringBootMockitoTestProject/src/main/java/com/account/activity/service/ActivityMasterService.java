package com.account.activity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.activity.bean.ActivityBean;
import com.account.activity.models.ActivityMaster;
import com.account.activity.repository.ActivityMasterRepo;

@Service
public class ActivityMasterService {

	private ActivityMasterRepo activityMasterRepo;

	@Autowired
	public void setActivityMasterRepo(ActivityMasterRepo activityMasterRepo) {
		this.activityMasterRepo = activityMasterRepo;
	}
	
	public void saveActivityMaster(ActivityBean act) {
		ActivityMaster actMaster = new ActivityMaster();

		
		activityMasterRepo.save(actMaster);
	}
}
