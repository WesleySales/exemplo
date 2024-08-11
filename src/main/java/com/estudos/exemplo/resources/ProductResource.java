package com.estudos.exemplo.resources;

import com.estudos.exemplo.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.estudos.exemplo.repositories.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductResource {
    @Autowired
    private ProductRepository produtcRepository;
    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> list = produtcRepository.findAll() ;
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(long id){
        Product product = produtcRepository.findById(id);
        return ResponseEntity.ok().body(product);
    }
}
