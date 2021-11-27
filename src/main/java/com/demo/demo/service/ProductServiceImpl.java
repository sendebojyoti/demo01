package com.demo.demo.service;

import com.demo.demo.model.Product;
import com.demo.demo.model.ProductRepo;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  ProductRepo productRepo;

  @Override
  public void createProduct(Product product) {
    productRepo.put(product.getId(), product);
  }

  @Override
  public void updateProduct(String id, Product product) {
    productRepo.remove(id);
    product.setId(id);
    productRepo.put(id, product);
  }

  @Override
  public void deleteProduct(String id) {
    productRepo.remove(id);

  }

  @Override
  public Collection<Product> getProducts() {
    return productRepo.values();
  }
}