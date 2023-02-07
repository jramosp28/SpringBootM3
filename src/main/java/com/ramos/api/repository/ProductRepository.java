/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ramos.api.repository;

import com.ramos.api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author javierrampob
 */
public interface ProductRepository extends JpaRepository<Product, Integer>{
    
}
