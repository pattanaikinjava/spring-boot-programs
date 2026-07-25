package com.ws.rest.controller;

import com.ws.rest.model.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class ProductController
{
    @GetMapping("/{id}")
    public Order getProduct(@PathVariable  Integer id){
     return  new Order(id,"Laptop");
    }
    //here spring boot automatically converts Java object to JSON object. This is ReST API...

}
