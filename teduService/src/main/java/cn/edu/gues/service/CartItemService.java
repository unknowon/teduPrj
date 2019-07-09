package cn.edu.gues.service;

import cn.edu.gues.mapper.CartItemMapper;
import cn.edu.gues.pojo.Book;
import cn.edu.gues.pojo.CartItem;
import cn.edu.gues.pojo.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;

/**
 * CartItem
 *
 * @author lulu
 * @date 2019-07-02
 **/
@Service
public class CartItemService extends ManyToManyBaseService<CartItem, User, Book> {
}
