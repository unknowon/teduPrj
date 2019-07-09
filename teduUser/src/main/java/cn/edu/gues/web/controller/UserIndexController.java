package cn.edu.gues.web.controller;

import cn.edu.gues.pojo.Book;
import cn.edu.gues.pojo.User;
import cn.edu.gues.service.BookService;
import cn.edu.gues.service.UserService;
import cn.edu.gues.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * userIndexController
 *
 * @author lulu
 * @date 2019-07-02
 **/
@Controller
@RequestMapping("/")
public class UserIndexController {

    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;

    @RequestMapping("/")
    public ModelAndView index(){

        List<Book> bookList = bookService.selectList();
        return new ModelAndView("index", "bookList", bookList);
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
            return new ModelAndView("redirect:/");
        } else{
            return new ModelAndView("login", "msg", "用户名或密码错误");
        }
    }


    @RequestMapping(value = "register.do",  method = RequestMethod.GET)
    public ModelAndView register(){
        return new ModelAndView("register");
    }

    @RequestMapping("unameCheck.do")
    public @ResponseBody AjaxResult unameCheck(String uname){
        User user = new User();
        user.setUname(uname);

        if(userService.selectOne(user) == null){
            return AjaxResult.successInstance("用户名不重复");
        } else{
            return AjaxResult.errorInstance("用户名已注册");
        }
    }

    @RequestMapping("emailCheck.do")
    public @ResponseBody AjaxResult emailCheck(String email){
        User user = new User();
        user.setEmail(email);

        if(userService.selectOne(user) == null){
            return AjaxResult.successInstance("邮箱不重复");
        } else{
            return AjaxResult.errorInstance("邮箱已注册");
        }
    }

    @RequestMapping("phoneCheck.do")
    public @ResponseBody AjaxResult phoneCheck(String phone){
        User user = new User();
        user.setPhone(phone);

        if(userService.selectOne(user) == null){
            return AjaxResult.successInstance("手机号不重复");
        } else{
            return AjaxResult.errorInstance("手机号已注册");
        }
    }

    @RequestMapping(value = "register.do",  method = RequestMethod.POST)
    public ModelAndView registerSubmit(User user){
        user.setRole(0);
        userService.insert(user);
        return new ModelAndView("login");
    }




}
