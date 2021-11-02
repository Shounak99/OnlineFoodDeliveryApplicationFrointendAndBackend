package io.capgemini.fooddelivery.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.capgemini.fooddelivery.models.Item;

@Service
public interface IItemService  {
	public Item addItem(Item item);
	public Item updateItem(Item item,Long id);
	public ResponseEntity<Item> removeItem(Long id);
	public Item viewItemById(Long id);
	public List<Item> viewAllItems();
	

}
