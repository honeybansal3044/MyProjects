package com.jpa.relationship.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.relationship.model.Store;

@Repository
public interface StoreRepo extends JpaRepository<Store, Long> {

}
