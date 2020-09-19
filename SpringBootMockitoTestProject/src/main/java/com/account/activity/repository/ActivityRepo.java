package com.account.activity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.account.activity.models.Activity;

@Repository
public interface ActivityRepo extends CrudRepository<Activity, Long> {

}
