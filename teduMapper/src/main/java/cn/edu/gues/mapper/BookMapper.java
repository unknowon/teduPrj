package cn.edu.gues.mapper;

import cn.edu.gues.pojo.Book;
import cn.edu.gues.pojo.Img;

public interface BookMapper extends IMapper<Book> {

    int insertImg(Img img);
}
