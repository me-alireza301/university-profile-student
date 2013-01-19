package ua.com.ups.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * This controller for view User information.
 *
 * @author: Alex.Barchuk
 * Date: 04.12.12
 */

@Controller
@SessionAttributes
public class ProfileController {

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String profile(ModelMap model) {
        return "profile";
    }

}
