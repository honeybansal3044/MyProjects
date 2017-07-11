package hello;

import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jaas.JAASCallBackHandler;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("login", "loginForm", new LoginForm());
	}
	
	@RequestMapping(value = "/loginSubmit", method = RequestMethod.POST)
	public ModelAndView loginSubmit(@ModelAttribute("loginForm") LoginForm loginForm, ModelMap model) throws LoginException {
		if(loginForm.getUsername() != null && loginForm.getPassword() != null) {
			JAASCallBackHandler jch = new JAASCallBackHandler(loginForm);
			LoginContext lc = new LoginContext("JAASTutorial", jch);
		}
		
		
		return new ModelAndView("loginSuccess");
	}
}
