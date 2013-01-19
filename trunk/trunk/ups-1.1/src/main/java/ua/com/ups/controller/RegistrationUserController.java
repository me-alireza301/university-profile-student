package ua.com.ups.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import ua.com.ups.entity.User;
import ua.com.ups.entity.UserRole;
import ua.com.ups.entity.enums.UserRoleEnum;
import ua.com.ups.service.UserService;
import ua.com.ups.validator.RegistrationValidator;

/**
 * Date: 10/26/12
 * @author alex.barchuk
 */

@Controller
@SessionAttributes
public class RegistrationUserController {

    private UserService service;
    private RegistrationValidator validator;

    @Autowired
    public RegistrationUserController(RegistrationValidator validator, UserService service){
        this.validator = validator;
        this.service = service;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView registrationUser(@ModelAttribute("command") User user,
                                   BindingResult result,
                                   SessionStatus status) {

        validator.validate(user, result);

        if(result.hasErrors()){
            return new ModelAndView("registration", "command", user);
        }else {
            status.setComplete();
            user.setUserRole(service.getRole(UserRoleEnum.ANONYMOUS.value()));
            service.add(user);
        }

        return new ModelAndView("registration", "command", user);
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registrationView(ModelMap model) {
        model.addAttribute("command", new User());

        return "registration";
    }

}
