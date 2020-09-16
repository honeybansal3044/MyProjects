package com.account.activity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.account.activity.models.ActivityMaster;

@Repository
public interface ActivityMasterRepo extends JpaRepository<ActivityMaster, Long> {

}
