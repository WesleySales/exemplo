package com.estudos.exemplo.resources;

import com.estudos.exemplo.entities.WS_Order;
import com.estudos.exemplo.entities.WS_Order;
import com.estudos.exemplo.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping (value = "/orders")
public class OrderResource {
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public ResponseEntity<List<WS_Order>> findAll(){
        List<WS_Order> list = orderRepository.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<WS_Order> findById(@PathVariable long id){
        WS_Order order = (WS_Order) orderRepository.findById(id).get();
        return ResponseEntity.ok().body(order);
    }



}
