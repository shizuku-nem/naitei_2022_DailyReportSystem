package trainingManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import trainingManagementSystem.model.User;
import trainingManagementSystem.service.UserServices;

@Controller
@RequestMapping("users")
public class UserController {

	@Autowired
	UserServices userService;

	@PostMapping("/create")
	@ResponseBody
	public String saveUser(ModelMap model, @ModelAttribute("user") User user) {

		userService.saveUser(user);
		model.addAttribute("message", "Success adding user!");
		return "users/index";
	}

}
