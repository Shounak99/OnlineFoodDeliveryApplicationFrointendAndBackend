package io.capgemini.fooddelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.capgemini.fooddelivery.models.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill,Long> {

}
