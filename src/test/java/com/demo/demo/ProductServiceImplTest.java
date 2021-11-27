package com.demo.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.demo.demo.model.Product;
import com.demo.demo.model.ProductRepo;
import com.demo.demo.service.ProductService;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class ProductServiceImplTest {

  @MockBean
  ProductRepo productRepo;

  @Autowired
  ProductService productService;

  @Test
  public void testService1() {
    Mockito.when(productRepo.values()).thenReturn(Collections.singletonList(new Product()));
    assertEquals(1, productService.getProducts().size());

  }

}
