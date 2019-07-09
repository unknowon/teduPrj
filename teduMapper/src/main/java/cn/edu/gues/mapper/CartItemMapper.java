package cn.edu.gues.mapper;

import cn.edu.gues.pojo.Book;
import cn.edu.gues.pojo.CartItem;
import cn.edu.gues.pojo.User;

public interface CartItemMapper extends IManyToManyMapper<CartItem, User, Book> {
}
