package com.springboot.ecomerceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.ecomerceapp.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
