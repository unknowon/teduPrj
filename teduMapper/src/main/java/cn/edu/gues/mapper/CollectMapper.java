package cn.edu.gues.mapper;

import cn.edu.gues.pojo.Book;
import cn.edu.gues.pojo.Collect;
import cn.edu.gues.pojo.User;

public interface CollectMapper extends IManyToManyMapper<Collect, User, Book> {
}
