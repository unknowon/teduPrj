package cn.edu.gues.web.controller;

import cn.edu.gues.pojo.*;
import cn.edu.gues.service.*;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sun.nio.cs.ext.COMPOUND_TEXT_Decoder;

import java.util.List;

/**
 * OrderController
 *
 * @author lulu
 * @date 2019-07-03
 **/
@Controller
@RequestMapping("/Order")
public class OrderController {

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderItemService orderItemService;

    @Autowired
    private AddressService addressService;

    @Autowired
    private BookService bookService;

    @RequestMapping("/orderList.do")
    public ModelAndView orderList(String sta){
        Order order = new Order();
        order.setSta(sta);

        List<Order> orderList = orderService.selectList(order);

        ModelAndView modelAndView = new ModelAndView("order/orderList");
        modelAndView.addObject("orderList", orderList);
        modelAndView.addObject("sta", sta);

        return modelAndView;
    }

    @RequestMapping("/orderDetail.do")
    public ModelAndView orderDetail(Long id){
        return getOrderAllInfo(id, "order/orderDetail");
    }

    @RequestMapping(value = "/orderProcess.do", method = RequestMethod.GET)
    public ModelAndView orderProcess(Long id){
        return getOrderAllInfo(id, "order/orderProcess");
    }

    @RequestMapping(value = "/orderProcess.do", method = RequestMethod.POST)
    public ModelAndView orderProcessSubmit(Long id, String sta){
        Order order = orderService.selectOne(id);
        order.setSta(sta);
        orderService.update(order);
        return getOrderAllInfo(id, "order/orderProcess");
    }

    @RequestMapping("/orderPrint.do")
    public ModelAndView orderPrint(Long id){
        return getOrderAllInfo(id, "order/orderPrint");
    }

    private ModelAndView getOrderAllInfo(Long id, String viewName){
        ModelAndView modelAndView = new ModelAndView(viewName);


        Order order = orderService.selectOne(id);
        Address address = addressService.selectOne(order.getAddressId());
        List<Book> bookList = orderItemService.selectFirstListBySecondId(order.getId());
        OrderItem orderItem = new OrderItem();
        orderItem.setOrderId(order.getId());
        List<OrderItem> orderItemList = orderItemService.selectList(orderItem);



        modelAndView.addObject("order", order);
        modelAndView.addObject("address", address);

        modelAndView.addObject("bookList", bookList);
        modelAndView.addObject("orderItemList", orderItemList);

        return modelAndView;
    }

}
