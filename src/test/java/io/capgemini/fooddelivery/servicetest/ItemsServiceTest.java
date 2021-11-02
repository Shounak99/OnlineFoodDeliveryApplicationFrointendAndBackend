package io.capgemini.fooddelivery.servicetest;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import io.capgemini.fooddelivery.models.Item;
import io.capgemini.fooddelivery.repository.ItemRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemsServiceTest {
	@MockBean
	private ItemRepository itemRepository;
	@Test
	public void addItemTest() {
		Item item=new Item((long) 105,"Chciken Tikka",12,30.0,null,null);
		List<Item> itemList=itemRepository.findAll();
		for(Item i:itemList) {
			if(i.getItemId()==item.getItemId()) {
				assertEquals(i,item);
			}
		}
	}

}
