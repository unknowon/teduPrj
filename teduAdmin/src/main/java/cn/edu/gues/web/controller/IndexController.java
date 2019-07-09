package cn.edu.gues.web.controller;

import cn.edu.gues.pojo.User;
import cn.edu.gues.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * IndexController
 *
 * @author lulu
 * @date 2019-07-02
 **/
@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    public ModelAndView welcome(){
        return new ModelAndView("welcome");
    }

    @RequestMapping(value = "/login.do", method = RequestMethod.GET)
    public ModelAndView login(){
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public ModelAndView loginSubmit(String uname, String upwd, HttpServletRequest request){
        User user = new User();
        user.setUname(uname);
        user.setUpwd(upwd);
        User userTmp = userService.selectOne(user);
        if(userTmp != null){
            request.getSession().setAttribute("user", userTmp);
            request.getSession().setAttribute("userName", userTmp.getUname());
            return new ModelAndView("index");
        } else{
            return new ModelAndView("login","msg", "用户名或密码错误");
        }
    }

    @RequestMapping(value = "passwordChange.do", method = RequestMethod.GET)
    public ModelAndView passwordChange(HttpServletRequest request){
        return new ModelAndView("passwordChange");
    }

    @RequestMapping(value = "passwordChange.do", method = RequestMethod.POST)
    public ModelAndView passwordChangeSubmit(HttpServletRequest request, String cpassword, String npassword, String cnpassword){
        User user = (User) request.getSession().getAttribute("user");
        if(user.getUpwd().equals(cpassword) && npassword.equals(cnpassword)){
            user.setUpwd(npassword);
        }
        userService.update(user);
        return new ModelAndView("login");
    }

    @RequestMapping("logout.do")
    public ModelAndView logout(HttpServletRequest request){
        request.getSession().invalidate();
        return new ModelAndView("redirect:/login.do");
    }




}
