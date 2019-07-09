package cn.edu.gues.service;

import cn.edu.gues.pojo.Address;
import cn.edu.gues.pojo.Order;
import cn.edu.gues.pojo.User;
import org.springframework.stereotype.Service;

/**
 * OrderService
 *
 * @author lulu
 * @date 2019-07-02
 **/
@Service
public class OrderService extends ManyToManyBaseService<Order, User, Address> {
}
