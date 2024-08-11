package com.estudos.exemplo.repositories;

import com.estudos.exemplo.entities.Category;
import com.estudos.exemplo.entities.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CategoryRepository {

    private Map<Long, Category> map = new HashMap<>();


    public void save(Category category){
        map.put(category.getId(), category);
    }

    public List<Category> findAll(){
        return new ArrayList<Category>(map.values());
    }
    public Category findById(long id){
        return map.get(id);
    }
}
