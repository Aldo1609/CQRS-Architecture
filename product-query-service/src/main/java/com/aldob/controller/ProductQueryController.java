package com.aldob.controller;

import com.aldob.entity.Product;
import com.aldob.service.ProductQueryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.StreamSupport;

@RequestMapping("/products")
@AllArgsConstructor
@RestController
public class ProductQueryController {

    private ProductQueryService queryService;

    @GetMapping
    public List<Product> fetchAllProducts() {
        Iterable<Product> products = queryService.getProducts();
        return StreamSupport.stream(products.spliterator(), false)
                            .toList();
    }
}