package com.upc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
public class UserController {

	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	/**
	 * 使用ModelAndView传递参数
	 *
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value="login", method= RequestMethod.POST)
	public ModelAndView login(String username, String password) {
		if (this.checkParams(new String[] { username, password })) {
			ModelAndView mav = new ModelAndView("succ");
			mav.addObject("username", username);
			mav.addObject("password", password);

			return mav;
		}

		return new ModelAndView("login");
	}

	/**
	 * 使用HttpServletRequest传递参数
	 *
	 * @param username
	 * @param password
	 * @param request
	 * @return
	 */
	@RequestMapping(value="login2", method= RequestMethod.POST)
	public ModelAndView login2(String username, String password, HttpServletRequest request) {
		if (this.checkParams(new String[] { username, password })) {
			ModelAndView mav = new ModelAndView("succ");
			request.setAttribute("username", username);
			request.setAttribute("password", password);

			return mav;
		}

		return new ModelAndView("login");
	}

	/**
	 * 使用Model得形式传递参数
	 *
	 * @param username
	 * @param password
	 * @param model
	 * @return
	 */
	@RequestMapping(value="login3", method= RequestMethod.POST)
	public String login3(String username, String password, Model model) {
		if (username.equals("a") && password.equals("a")) {

			model.addAttribute("username1", username);
			model.addAttribute("password1", password);


			return "succ";
		}

		return "login";
	}



	private boolean checkParams(String[] params) {
		for (String param : params) {
			if (param == "" || param == null || param.isEmpty()) {
				return false;
			}
		}
		return true;
	}
}
