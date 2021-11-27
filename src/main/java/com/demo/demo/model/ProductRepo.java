package com.demo.demo.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class ProductRepo {

  public static Map<String, Product> productRepo = new HashMap<>();

  static {
    Product honey = new Product();
    honey.setId("1");
    honey.setName("Honey");
    productRepo.put(honey.getId(), honey);

    Product almond = new Product();
    almond.setId("2");
    almond.setName("Almond");
    productRepo.put(almond.getId(), almond);
  }


  public void put(String id, Product product) {
    Product product1 = new Product();
    product1.setId(id);
    product1.setName(product.getName());
    productRepo.put(id, product1);
  }

  public void remove(String id) {
    productRepo.remove(id);
  }

  public Collection<Product> values() {
    return productRepo.values();
  }


}
