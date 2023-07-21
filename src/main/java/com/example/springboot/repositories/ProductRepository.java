package com.example.springboot.repositories;

import com.example.springboot.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository // neste caso não precisaria pois o JpaRepository já reconhece por Default
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
}
