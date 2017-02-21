package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

public class HelloParametrizableViewController extends ParameterizableViewController {
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse response) throws Exception {
		String name = req.getParameter("name");
		Map<String, String> m = new HashMap<String, String>();
		m.put("msg", "Hello " + name + " 3 !");
		ModelAndView mav = new ModelAndView(getViewName(), m);
		return mav;
	}

}
