package com.example.assignment1.service;

import com.example.assignment1.model.Order;
import com.example.assignment1.model.Show;
import com.example.assignment1.repository.OrderRepository;
import com.example.assignment1.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
@Autowired
private OrderRepository orderRepository;
@Autowired
private ShowRepository showRepository;


public OrderService(OrderRepository orderRepository){
    this.orderRepository=orderRepository;
}

public List<Order> getAllOrders(){
    List<Order> orders= new ArrayList<>();
    orderRepository.findAll().forEach(orders::add);
return orders;
}

@Transactional
public void saveOrder(Order order){
    Optional<Show> show = showRepository.findById(order.getShow().getId_show());
    if(!show.isPresent()) {
        throw new RuntimeException("Show not found!");
    }
    if(show.get().getCantitate() < order.getQuantity()) {
        throw new RuntimeException("Quantity not enough");
    }
    show.get().setCantitate(show.get().getCantitate() - order.getQuantity());
    orderRepository.save(order);
    showRepository.save(show.get());
}

public Order getOrderById(long id) {
    Optional<Order> optional = orderRepository.findById(id);
    Order order = null;
    if (optional.isPresent()) {
        order = optional.get();
    } else {
        throw new RuntimeException("Order is not found by id");
    }
    return order;
}

public void deleteOrderById(long id){
    orderRepository.deleteById(id);
}


}


