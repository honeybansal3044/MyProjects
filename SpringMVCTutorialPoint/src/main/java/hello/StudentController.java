package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student", "command", new Student());
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("studend") Student student, ModelMap model) {
		if (student.getName().length() < 5) {
			throw new StudentException("Given name is too short");
		} else {
			model.addAttribute("name", student.getName());
		}
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());

		return "result";
	}
	
	@ExceptionHandler({ StudentException.class })
	public ModelAndView handleException(StudentException ex) {
		ModelAndView model = new ModelAndView("exception");
		model.addObject("message", "Hello");
	    model.addObject("exception", ex);
	 
	    return model;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index");
		model.addObject("message", "Hello");
	    return model;
	}

	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String redirect(Model model) {
		model.addAttribute("message", "Hello");
		return "redirect:finalPage.do";
	}

	@RequestMapping(value = "/finalPage", method = RequestMethod.GET)
	public String finalPage(Model model) {
		return "final";
	}

	@RequestMapping(value = "/forward", method = RequestMethod.GET)
	public String forward(Model model) {
		model.addAttribute("message", "Hello");
		return "forward:finalPage.do";
	}
}
