package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@GetMapping("/user")
	public List<Map<String, Object>> handleReq() {
		List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from alien");
		return list;
	}

	@GetMapping("/produce")
	public String sendMessage() {
		kafkaTemplate.send("TestTopic", "This message is from Kafka");
		return "Message Sent";
	}
	
	@KafkaListener(topics = "TestTopic", groupId = "group-id")
	public void listen(String message) {
	   System.out.println("Received Messasge in group - group-id: " + message);
	}

}
