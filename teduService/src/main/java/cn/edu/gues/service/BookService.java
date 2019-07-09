package cn.edu.gues.service;

import cn.edu.gues.mapper.BookMapper;
import cn.edu.gues.pojo.Book;
import cn.edu.gues.pojo.Img;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BookService
 *
 * @author lulu
 * @date 2019-07-02
 **/
@Service
public class BookService extends BaseService<Book> {

    @Autowired
    private BookMapper mapper;

    public int insertImg(Img img){
        return mapper.insertImg(img);
    }
}
