package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControllerAnnotation {

	@RequestMapping(value="/hello6.htm", method=RequestMethod.POST)
	public ModelAndView sayHello(HttpServletRequest req, HttpServletResponse res) {
		String name = req.getParameter("name");
		Map<String, String> m = new HashMap<String, String>();
		m.put("msg", "Hello " + name + " !");
		ModelAndView mav = new ModelAndView("success", m);
		return mav;
	}
	
	@RequestMapping(value="/hello7.htm", method=RequestMethod.POST)
	public ModelAndView sayHello2(HttpServletRequest req, HttpServletResponse res, @ModelAttribute Person person) {
		Map<String, String> m = new HashMap<String, String>();
		m.put("msg", "Hello " + person.getName() + " !");
		ModelAndView mav = new ModelAndView("success", m);
		return mav;
	}
	
	@ModelAttribute
	public void addObjectToModel(Model model) {
		model.addAttribute("msgPrefix", "Hello");
	}
}
