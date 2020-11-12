package com.example.carro.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.carro.entity.Product;

@CrossOrigin("http://localhost:4200")
public interface IProductDao extends JpaRepository<Product, Long> {

}