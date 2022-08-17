package trainingManagementSystem.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import trainingManagementSystem.dao.impl.UserDAOImpl;

@Controller
public class HomeController {
	private static final Logger logger = LogManager.getLogger(UserDAOImpl.class);
	
	@RequestMapping(value  = {"/", "trang-chu"}, method = RequestMethod.GET)
	public String index() {
		logger.info("home page");
		return "user\\index";
	}
}
