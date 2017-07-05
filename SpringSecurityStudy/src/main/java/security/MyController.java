package security;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value = "/loginAction", method = RequestMethod.GET)
	public String loginAction(Model model) {
		return "login";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcomePage(Model model) {
		return "home";
	}

}
