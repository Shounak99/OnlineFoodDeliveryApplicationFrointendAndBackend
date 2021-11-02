package io.capgemini.fooddelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.capgemini.fooddelivery.models.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {

}
