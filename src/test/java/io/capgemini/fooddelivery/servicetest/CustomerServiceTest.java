package io.capgemini.fooddelivery.servicetest;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import io.capgemini.fooddelivery.models.Address;
import io.capgemini.fooddelivery.models.Customer;
import io.capgemini.fooddelivery.repository.CustomerRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {

	@MockBean
	private CustomerRepository custRepository;
	@Test
	public void addCustomerTest() {
		Customer cust=new Customer((long) 101,"Rajesh","Kumar",20,"M",new Address((long) 102,"sfs","fwf","fdf","afaf","dsf","jg","kjh"),"21231123123","hgd@jhs.com");
	  Mockito.when(custRepository.save(cust)).thenReturn(cust);
		List<Customer> customerList=custRepository.findAll();
		for(Customer c:customerList) {
			if(c.getId()==cust.getId()) {
				assertEquals(c,cust);
			}
		}
		
	}
	

}
