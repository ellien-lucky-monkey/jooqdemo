package com.jooq.demo.controller;

import com.jooq.demo.domain.tables.pojos.User;
import com.jooq.demo.service.LoginService;
import com.jooq.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * @author ellien
 * @package com.jooq.demo.controller
 * @date 2017/12/07 14:43
 */
@Controller
public class IndexController {

    @Autowired
    private UserService userService;
    @Autowired
    private LoginService loginService;

    @RequestMapping(value="/demo", method = RequestMethod.GET)
    public String demo(){
        return "login";
    }

    @RequestMapping(value={"/", "/index"}, method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value="register", method = RequestMethod.GET)
    public ModelAndView registration(){
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("registration");
        return modelAndView;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String createNewUser(@Valid User user, Integer type) {
        User oldUser = userService.findByUserName(user.getUsername());
        if (oldUser != null) {
            return "login";
        }
        userService.createUser(user.getUsername(),user.getMobile(),user.getPassword(),user.getNickName(),type);
        return "login";
    }
}
