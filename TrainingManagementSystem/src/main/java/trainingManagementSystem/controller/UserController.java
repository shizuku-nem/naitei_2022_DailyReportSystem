package trainingManagementSystem.controller;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import trainingManagementSystem.dao.impl.UserDAOImpl;
import trainingManagementSystem.entity.User;
import trainingManagementSystem.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	private static final Logger logger = LogManager.getLogger(UserDAOImpl.class);

	@Autowired
	private UserService userService;

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String index(Model model) {
		logger.info("user page");
		model.addAttribute("user", new User("Trong Dai", "abc@gmail.com"));
		return "user/index";
	}

	@RequestMapping(path = "/", method = RequestMethod.POST)
	public String saveUser(Model model, @ModelAttribute(value = "user") User user) {
		logger.info("save user");
		logger.info(user);
		if (user != null) {
			userService.saveOrUpdate(user);
		}
		return "user/index";

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String show(@PathVariable("id") int id, Model model) {
		logger.info("detail user");
		User user = userService.findById(id);
		if (user == null) {
			model.addAttribute("css", "danger");
			model.addAttribute("msg", "User not found");
		}
		model.addAttribute("user", user);
		return "views/user";
	}

	@RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
	public String deleteUser(@PathVariable("id") Integer id, final RedirectAttributes redirectAttributes) {
		logger.info("delete user");
		if (userService.deleteUser(id)) {
			redirectAttributes.addFlashAttribute("css", "success");
			redirectAttributes.addFlashAttribute("msg", "User is deleted!");
		} else {
			redirectAttributes.addFlashAttribute("css", "error");
			redirectAttributes.addFlashAttribute("msg", "Delete user fails!!!!");
		}

		return "redirect:/";

	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String newUser(Model model) {
		logger.info("add user");
		User user = new User();

		model.addAttribute("userForm", user);
		model.addAttribute("status", "add");

		return "user/index";

	}

	@RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
	public String editUser(@PathVariable("id") int id, Model model) {

		User user = userService.findById(id);
		model.addAttribute("userForm", user);
		model.addAttribute("status", "edit");

		return "views/user-form";

	}

}
