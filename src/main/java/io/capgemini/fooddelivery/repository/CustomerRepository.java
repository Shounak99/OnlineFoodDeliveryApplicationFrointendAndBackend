package io.capgemini.fooddelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.capgemini.fooddelivery.models.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
