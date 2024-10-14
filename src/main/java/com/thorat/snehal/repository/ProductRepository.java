package com.thorat.snehal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.thorat.snehal.model.Product;

@RepositoryRestResource(path = "prod", collectionResourceRel = "prd")
public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findByProdPrice(Double prodPrice);

	List<Product> findByProdPriceGreaterThan(Double prodPrice);

	List<Product> findByProdName(String prodName);

	List<Product> findByProdNameAndProdPrice(String prodName, Double prodPrice);
	
	List<Product> findByProdNameStartsWith(String str);
	
	List<Product> findByProdNameContains(String str);

}
