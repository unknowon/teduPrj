package cn.edu.gues.mapper;

import cn.edu.gues.pojo.Address;
import cn.edu.gues.pojo.Order;
import cn.edu.gues.pojo.User;

public interface OrderMapper extends IManyToManyMapper<Order, User, Address> {
}
