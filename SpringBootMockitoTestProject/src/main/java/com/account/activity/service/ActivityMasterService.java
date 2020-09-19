package com.account.activity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.activity.bean.ActivityBean;
import com.account.activity.models.Activity;
import com.account.activity.models.ActivityMaster;
import com.account.activity.repository.ActivityMasterRepo;
import com.account.activity.repository.ActivityRepo;

@Service
public class ActivityMasterService {

	private ActivityMasterRepo activityMasterRepo;

	private ActivityRepo activityRepo;

	@Autowired
	public void setActivityMasterRepo(ActivityMasterRepo activityMasterRepo) {
		this.activityMasterRepo = activityMasterRepo;
	}

	@Autowired
	public void setActivityRepo(ActivityRepo activityRepo) {
		this.activityRepo = activityRepo;
	}

	public ActivityMaster saveActivityMaster(ActivityBean act) {
		if (act == null) {
			return activityMasterRepo.save(null);
		}
		return activityMasterRepo.save(new ActivityMaster());
	}

	public ActivityMaster updateActivityMaster(Long actMasterId, ActivityBean act) {
		ActivityMaster activityMaster = findById(actMasterId);
		//Activity activity = findActivityById(act.getId());
		return null;
	}

	public ActivityMaster findById(Long actMasterId) {
		Optional<ActivityMaster> optional = activityMasterRepo.findById(actMasterId);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}
	
	public Activity findActivityById(Long actId) {
		Optional<Activity> optional = activityRepo.findById(actId);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}
	
	public void deleteActivityMaster(Long actMasterId) {
		activityMasterRepo.deleteById(actMasterId);
	}
}
