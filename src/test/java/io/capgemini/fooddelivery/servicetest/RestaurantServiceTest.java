package io.capgemini.fooddelivery.servicetest;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import io.capgemini.fooddelivery.models.Restaurant;
import io.capgemini.fooddelivery.repository.RestaurantRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestaurantServiceTest {
    @MockBean
    private RestaurantRepository restRepository;
    @Test
    public void addRestaurantTest() {
    	Restaurant res=new Restaurant((long) 121,"Pizza Hut",null,"Ben","8798327",null);
    	Mockito.when(restRepository.save(res)).thenReturn(res);
    	List<Restaurant> resList=restRepository.findAll();
    	for(Restaurant r:resList) {
    		if(r.getRestaurantId()==res.getRestaurantId()) {
    			assertEquals(r,res);
    		}
    	}
    }
    
}
