package io.capgemini.fooddelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import io.capgemini.fooddelivery.models.OrderDetails;
@Repository
public interface OrderRepository extends JpaRepository<OrderDetails,Long> {

}
