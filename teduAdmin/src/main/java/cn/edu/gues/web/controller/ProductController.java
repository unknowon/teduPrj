package cn.edu.gues.web.controller;

import cn.edu.gues.pojo.Book;
import cn.edu.gues.pojo.Img;
import cn.edu.gues.pojo.IsbnJsonObj;
import cn.edu.gues.service.BookService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * ProductController
 *
 * @author lulu
 * @date 2019-07-04
 **/
@Controller
@RequestMapping("/Product")
public class ProductController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/productList.do")
    public ModelAndView productList(){

        List<Book> bookList = bookService.selectList();

        return new ModelAndView("product/productList", "bookList", bookList);
    }

    @RequestMapping("/productDetail.do")
    public ModelAndView productDetail(Long id){
        Book book = bookService.selectOne(id);
        return new ModelAndView("product/productDetail","book", book);
    }

    @RequestMapping(value = "/productEdit.do", method = RequestMethod.GET)
    public ModelAndView productEdit(Long id){
        Book book = bookService.selectOne(id);
        return new ModelAndView("product/productEdit","book", book);
    }

    @RequestMapping(value = "/productEdit.do", method = RequestMethod.POST)
    public ModelAndView productEditSubmit(Long id, Double price){
        Book book = bookService.selectOne(id);
        book.setPrice(price);
        bookService.update(book);
        return new ModelAndView("product/productEdit", "book", book);
    }

    @RequestMapping(value = "/productAdd.do", method = RequestMethod.GET)
    public ModelAndView productAdd(){
        return new ModelAndView("product/productAdd");
    }

    @RequestMapping(value = "/productAddSubmit.do", method = RequestMethod.POST)
    public ModelAndView productAddSubmit(String isbn){
        String url = "http://feedback.api.juhe.cn/ISBN?"+"sub="+isbn+"&key=d24b071178e7820a13033c2eab17b75f";

        try {
            String json = IOUtils.toString(new URL(url), "UTF-8");
            Gson gson = new GsonBuilder().setDateFormat("yyyy/MM/dd HH:mm:ss").create();
            if (json.length() < 200){
                return new ModelAndView("product/productSimpleAdd");
            }

            java.lang.reflect.Type type = new TypeToken<IsbnJsonObj>(){}.getType();
            IsbnJsonObj isbnJsonObj = gson.fromJson(json, type);

            Book book = new Book();
            book.setAuthor(isbnJsonObj.getResult().getAuthor());
            book.setPrice(Double.valueOf(isbnJsonObj.getResult().getPrice()));
            book.setIsbn(isbnJsonObj.getResult().getIsbn13());
            book.setTitle(isbnJsonObj.getResult().getTitle());
            book.setPress(isbnJsonObj.getResult().getPublisher());
            book.setEdition(1);
            try {
                book.setPublished(new SimpleDateFormat("yyyy-MM").parse(isbnJsonObj.getResult().getPubdate()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            book.setPages(Integer.valueOf(isbnJsonObj.getResult().getPages()));
            book.setWords(0);
            book.setPackaging(isbnJsonObj.getResult().getBinding());
            book.setFormat("");
            book.setForm("");


            bookService.insert(book);
            book = bookService.selectOne(book);

            Img img = new Img();
            img.setProduct(book.getId());
            img.setIndexImg(isbnJsonObj.getResult().getImages_large());
            img.setMidImg(isbnJsonObj.getResult().getImages_medium());
            bookService.insertImg(img);


            return new ModelAndView("product/productList");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
