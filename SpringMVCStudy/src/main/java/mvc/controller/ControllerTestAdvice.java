package mvc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice(assignableTypes = {TestController1.class})
public class ControllerTestAdvice {
	
	@ModelAttribute
	public String addModelAttribute(){
		return "Hello";
	}
	
}
