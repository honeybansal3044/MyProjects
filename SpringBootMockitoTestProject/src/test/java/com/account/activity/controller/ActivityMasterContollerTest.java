package com.account.activity.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
public class ActivityMasterContollerTest {

	private MockMvc mockMvc;

	@InjectMocks
	ActivityMasterContoller controller;

	@BeforeEach
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}

	@Test
	public void testGetAccounts() throws Exception {
		ResultActions actions = mockMvc.perform(get("/accounts"));
		actions.andExpect(status().isOk()).andExpect(content().string("ACCOUNT"));
	}

}
