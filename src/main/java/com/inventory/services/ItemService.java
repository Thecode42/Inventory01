package com.inventory.services;

import com.inventory.dto.ItemDTO;
import com.inventory.entities.ItemEntity;
import com.inventory.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;

    public ArrayList<ItemDTO> getAllItems() {
        return convertToDTOList(itemRepository.findAll());
    }

    public ItemDTO getItemById(Long id) {
        return convertToDTOSimple(itemRepository.findById(id).orElse(null));
    }

    //Structure to setting value in dto
    public ItemDTO createItem(ItemDTO itemDTO) {
        ItemEntity itemEntity = new ItemEntity();
        itemEntity.setName(itemDTO.getName());
        itemEntity.setPrice(itemDTO.getPrice());
        itemEntity.setStock(itemDTO.getStock());
        return convertToDTOSimple(itemRepository.save(itemEntity));
    }
    //Structure to setting value in dto
    public ItemDTO updateItem(ItemDTO itemDTO) {
        ItemEntity itemEntity = itemRepository.getReferenceById(itemDTO.getId());
        itemEntity.setName(itemDTO.getName());
        itemEntity.setPrice(itemDTO.getPrice());
        itemEntity.setStock(itemDTO.getStock());
        return convertToDTOSimple(itemRepository.save(itemEntity));
    }
    //Update state to zero
    public Map<String, String> deleteOne(ItemDTO itemDTO) {
        ItemEntity itemEntity = itemRepository.getReferenceById(itemDTO.getId());
        itemEntity.setStatus(0);
        itemRepository.save(itemEntity);
        Map<String, String> messageResponse = new HashMap<>();
        messageResponse.put("message","Item has been deleted successfully");
        return messageResponse;
    }

    private ItemDTO convertToDTOSimple(ItemEntity itemEntity) {
        return new ItemDTO(itemEntity.getId(),itemEntity.getName(),itemEntity.getPrice(),itemEntity.getStock(),
                itemEntity.getStatus());
    }

    private ArrayList<ItemDTO> convertToDTOList(List<ItemEntity> items) {
        ArrayList<ItemDTO> list = new ArrayList<>();
        items.forEach(itemEntity -> {
            list.add(new ItemDTO(itemEntity.getId(),itemEntity.getName(),itemEntity.getPrice(),itemEntity.getStock(),
                    itemEntity.getStatus()));
        });
        return list;
    }
}
