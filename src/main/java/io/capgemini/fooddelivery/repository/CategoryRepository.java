package io.capgemini.fooddelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import io.capgemini.fooddelivery.models.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
