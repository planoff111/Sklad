package org.example.service;

import lombok.AllArgsConstructor;
import org.example.domain.Item;
import org.example.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ItemService {
    private final ItemRepository itemRepository;

    public Item save (Item item){
       return itemRepository.save(item);
    }

    public Item getById(Integer id) throws Exception {
        return itemRepository.findById(id).orElseThrow(() -> new Exception("Item not found with " + id ));

    }

    public List<Item> getAll(){
        return itemRepository.findAll();
    }
}
