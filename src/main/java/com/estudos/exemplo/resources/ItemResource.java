package com.estudos.exemplo.resources;

import com.estudos.exemplo.entities.Category;
import com.estudos.exemplo.entities.Item;
import com.estudos.exemplo.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/item")
public class ItemResource {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping
    public ResponseEntity<List<Item>> findAll(){
        List<Item> list = itemRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Item> findById(long id){
        Item item = itemRepository.findById(id).get();
        return ResponseEntity.ok().body(item);
    }
}
