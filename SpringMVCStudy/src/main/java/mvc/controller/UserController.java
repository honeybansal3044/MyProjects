package mvc.controller;

import java.io.IOException;
import java.net.URI;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.annotation.JsonView;

import mvc.model.User;

@RestController
public class UserController {

	@RequestMapping("/user")
	@JsonView(User.WithoutPasswordView.class)
	public User getUser(Model model) {
		model.addAttribute("user", new User("Honey", "123456"));
		model.addAttribute(JsonView.class.getName(), User.WithoutPasswordView.class);
		return new User("Honey", "123456");
	}

	@RequestMapping("/user1")
	public ResponseBodyEmitter getUser1(Model model) {
		ResponseBodyEmitter emitter = new ResponseBodyEmitter();
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					emitter.send("Hello");
					emitter.complete();
				} catch (IOException e) {
				}
			}
		});
		thread.start();
		return emitter;
	}

	public void getUser(HttpServletRequest request) {
		UriComponents uriComponent = UriComponentsBuilder.fromUriString("http://localhost:8080/user2/{id}").build();
		URI uri = uriComponent.expand("1").encode().toUri();

		UriComponents uriComponents1 = UriComponentsBuilder.newInstance().scheme("http").host("localhost").port("8080").path("/hotels/{hotel}/bookings/{booking}").build().expand("1").encode();

		UriComponents uriComponents2 = ServletUriComponentsBuilder.fromRequest(request).replaceQueryParam("accountId", "{id}").build().expand("123").encode();

		UriComponents uriComponents3 = ServletUriComponentsBuilder.fromContextPath(request).path("/accounts").build();

		UriComponents uriComponents34 = ServletUriComponentsBuilder.fromServletMapping(request).path("/accounts").build();

	}
}
