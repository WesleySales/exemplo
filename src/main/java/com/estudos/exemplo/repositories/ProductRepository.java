package com.estudos.exemplo.repositories;

import com.estudos.exemplo.entities.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Component
public class ProductRepository {
    private Map<Long, Product> map= new HashMap<>();

    public void save(Product product){
        map.put(product.getId(),product);
    }

    public List<Product> findAll(){
        return new ArrayList<Product>(map.values());
    }

    public Product findById(long id){
        return map.get(id);
    }
}
