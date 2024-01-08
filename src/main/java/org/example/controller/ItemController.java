package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.domain.Item;
import org.example.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class ItemController {

    private final ItemService itemService;

    @PostMapping("/items")
    @ResponseStatus(HttpStatus.CREATED)
    public Item save(@RequestBody Item item) {
        return itemService.save(item);
    }

    @GetMapping("/items{id}")
    @ResponseStatus(HttpStatus.OK)
    public Item getById(@PathVariable Integer id) throws Exception {
        return itemService.getById(id);
    }

    @GetMapping("/items")
    @ResponseStatus(HttpStatus.OK)
    public List<Item> getAll()  {
        return itemService.getAll();
    }
}
