package com.indi.order.controller;


import com.indi.order.entity.OrderEntity;
import com.indi.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ph
 * @since 2022-05-18
 */
@RestController
@RequestMapping("/api/order/")
public class OrderController {

    @Autowired
    IOrderService orderService;


    @PostMapping("save")
    public void save2(@RequestBody OrderEntity order) {
        orderService.save(order);
    }

    @GetMapping("get/list")
    public Object getList() {
        return orderService.list();
    }
}
