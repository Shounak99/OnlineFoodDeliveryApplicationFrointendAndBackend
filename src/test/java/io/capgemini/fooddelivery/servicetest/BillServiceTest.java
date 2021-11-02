package io.capgemini.fooddelivery.servicetest;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import io.capgemini.fooddelivery.models.Bill;
import io.capgemini.fooddelivery.repository.BillRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BillServiceTest {
	@MockBean
	private BillRepository billRepository;
	@Test 
	public void addBillTest() {
		Bill bill=new Bill((long) 9811,null,null,67,20);
		List<Bill> billList=billRepository.findAll();
		for(Bill b:billList) {
			if(b.getBillId()==bill.getBillId()) {
				assertEquals(b,bill);
			}
		}
	}
	

}
