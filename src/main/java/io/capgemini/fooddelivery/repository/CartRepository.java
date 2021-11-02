package io.capgemini.fooddelivery.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import io.capgemini.fooddelivery.models.FoodCart;
@Repository
public interface CartRepository extends JpaRepository<FoodCart,Long>{

}
