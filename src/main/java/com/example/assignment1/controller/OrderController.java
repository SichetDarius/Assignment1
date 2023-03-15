package com.example.assignment1.controller;

import com.example.assignment1.model.Order;
import com.example.assignment1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/orders")
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    public List<Order> getAllOrders() {
        List<Order> order = orderService.getAllOrders();
        return order;
    }

    @GetMapping
    public List<Order> showOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping
    public void addOrder(@RequestBody Order order) {
        orderService.saveOrder(order);
    }


    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable(value = "id") long id) {
        orderService.deleteOrderById(id);
    }

    @GetMapping("/show/{idShow}")
    public List<Order> getAllOrdersForShowId(@PathVariable(value = "idShow") long idShow) {
        return orderService.getAllOrders().stream().filter(order -> order.getShow().getId_show() == idShow).collect(Collectors.toList());
    }
}

