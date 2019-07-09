package cn.edu.gues.web.controller;

import cn.edu.gues.pojo.Book;
import cn.edu.gues.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * BookController
 *
 * @author lulu
 * @date 2019-07-03
 **/
@Controller
@RequestMapping("/Book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/detail.do")
    public ModelAndView bookDetail(Long id){

        Book book = bookService.selectOne(id);

        return new ModelAndView("detail", "book", book);
    }
}
