package cn.edu.gues.service;

import cn.edu.gues.pojo.Book;
import cn.edu.gues.pojo.Collect;
import cn.edu.gues.pojo.User;
import org.springframework.stereotype.Service;

/**
 * CollectService
 *
 * @author lulu
 * @date 2019-07-02
 **/
@Service
public class CollectService extends ManyToManyBaseService<Collect, User, Book> {
}
