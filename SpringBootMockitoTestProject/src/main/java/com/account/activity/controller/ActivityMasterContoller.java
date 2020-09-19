package com.account.activity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.activity.models.Account;

@RestController
public class ActivityMasterContoller {

	@GetMapping(value = "/accounts")
	public String getAccounts() {
		return Account.ACCOUNT.toString();
	}
}
