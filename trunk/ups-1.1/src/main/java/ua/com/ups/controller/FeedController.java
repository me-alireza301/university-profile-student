package ua.com.ups.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.ups.entity.User;
import ua.com.ups.entity.UserRole;
import ua.com.ups.service.UserRoleService;
import ua.com.ups.service.UserService;
import ua.com.ups.utils.LocaleWorker;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Alex.Barchuk
 * Date: 04.12.12
 */

@Controller
@RequestMapping(value = "/feed")
public class FeedController {

    private UserService userService;
    private UserRoleService userRoleService;

    @Autowired
    public FeedController(UserService userService, UserRoleService userRoleService){
        this.userService = userService;
        this.userRoleService = userRoleService;
    }

    private static final String PAGE = "feed";

    @RequestMapping(method = RequestMethod.GET)
    public String getFeeds(ModelMap model, Locale locale) {
        ResourceBundle messages = LocaleWorker.getResourceBundle(locale);
        List<UserRole> allRoles = userRoleService.getAllRoles();

        for(int i = 0; i < allRoles.size(); i++){
            allRoles.get(i).setName(messages.getString(allRoles.get(i).getAuthority()));
        }

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.getUserByEmail(authentication.getName());

        model.addAttribute("fullNameUser", user.getFirstname() + " " + user.getLastname());
        model.addAttribute("command", new UserRole());
        model.addAttribute("allRoles", allRoles);

        return PAGE;
    }

    @RequestMapping(value = "/authority", method = RequestMethod.POST)
    public String getInfoUSer(@RequestParam("authority") String id, ModelMap model, Locale locale){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        ResourceBundle messages = LocaleWorker.getResourceBundle(locale);

        User user = userService.getUserByEmail(authentication.getName());
        UserRole userRole = userRoleService.getByPK(Long.valueOf(id));

        if(userRole != null && userRole.getId() != 0){
            user.setUserRole(userRole);
            userService.edit(user);
        }else{
            // TODO call ErrorHandler
        }

        String messageReLogin = messages.getString("feed.re-entry.text");

        model.addAttribute("message", messageReLogin);
        return "redirect:/login.html";
    }

}
