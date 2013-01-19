package ua.com.ups.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import ua.com.ups.entity.User;
import ua.com.ups.service.UserService;

import javax.servlet.http.HttpSession;

/**
* This controller for view the Login page.
*
* Date: 10/17/12
* @author Alex.Barchuk
*/

@Controller
public class LoginController {

    private UserService service;

    @Autowired
    public LoginController(UserService service){
        this.service = service;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(ModelMap model) {
        return "login";
    }

    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logout(ModelMap model) {
        return "login";
    }

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String loginPage(ModelMap model) {
        return "login";
    }

}
