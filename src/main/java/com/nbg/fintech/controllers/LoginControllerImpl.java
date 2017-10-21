package com.nbg.fintech.controllers;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.nbg.fintech.forms.LoginForm;
 
@Component
public class LoginControllerImpl implements LoginController {

	  private static final Logger logger = LoggerFactory.getLogger(LoginControllerImpl.class);
 
//	public String logonUsessr(@PathVariable("userName") String email,@PathVariable("password") String password  ) {
//		return "test";
//	}
//	@RequestMapping(value = "/main", method = RequestMethod.GET)
//	public String welcomeAdmin(ModelMap model) {
//		model.addAttribute(DASHBOARD_BEAN, adminServices.retrieveMain());
//		return "admin/main";
//
//	}

	   @RequestMapping(value = "/login", method = RequestMethod.POST)
	    public RedirectView logonUser(Model model, @Valid @ModelAttribute("login") LoginForm loginForm,
	            BindingResult bindingResult) { 
		   return new RedirectView("/pages/404.html");
		   
	    
	   }
	 
}
