package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

@SuppressWarnings("deprecation")
public class MultiActionController extends org.springframework.web.servlet.mvc.multiaction.MultiActionController {

	public ModelAndView hello5(HttpServletRequest req, HttpServletResponse response) throws Exception {
		String name = req.getParameter("name");
		Map<String, String> m = new HashMap<String, String>();
		m.put("msg", "Hello " + name + " 5 !");
		ModelAndView mav = new ModelAndView("success", m);
		return mav;
	}
}
