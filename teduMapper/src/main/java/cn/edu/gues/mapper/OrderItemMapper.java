package cn.edu.gues.mapper;

import cn.edu.gues.pojo.Book;
import cn.edu.gues.pojo.Order;
import cn.edu.gues.pojo.OrderItem;

public interface OrderItemMapper extends IManyToManyMapper<OrderItem, Book, Order> {
}
