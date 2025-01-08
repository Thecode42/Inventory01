package com.inventory.controllers;

import com.inventory.dto.ItemDTO;
import com.inventory.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/inventory", produces = "application/json")
class InventoryController {
    @Autowired
    private ItemService itemServices;
    //Get all elements
    @GetMapping("/getAll")
    ResponseEntity<List<ItemDTO>> getAllInventory(){
        return new ResponseEntity<>(itemServices.getAllItems(),new HttpHeaders(), HttpStatus.OK);
    }
    //Get just one element
    @PostMapping("/getOne")
    ResponseEntity<ItemDTO> getOneInventory(@RequestBody ItemDTO itemDTO){
        return new ResponseEntity<>(itemServices.getItemById(itemDTO.getId()),new HttpHeaders(), HttpStatus.OK);
    }
    //Create one element
    @PostMapping("/create")
    ResponseEntity<ItemDTO> createInventory(@RequestBody ItemDTO itemDTO){
        return new ResponseEntity<>(itemServices.createItem(itemDTO),new HttpHeaders(), HttpStatus.CREATED);
    }
    //Update one element
    @PostMapping("/update")
    ResponseEntity<ItemDTO> updateInventory(@RequestBody ItemDTO itemDTO){
        return new ResponseEntity<>(itemServices.updateItem(itemDTO),new HttpHeaders(), HttpStatus.OK);
    }
    //Update state to zero when require to be delete
    @PostMapping("/deleteOne")
    ResponseEntity<Map<String,String>> deleteInventory(@RequestBody ItemDTO itemDTO){
        return new ResponseEntity<>(itemServices.deleteOne(itemDTO), new HttpHeaders(), HttpStatus.OK);
    }
}
