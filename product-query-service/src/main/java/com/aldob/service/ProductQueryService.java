package com.aldob.service;

import com.aldob.dto.ProductEvent;
import com.aldob.entity.Product;

public interface ProductQueryService {

    Iterable<Product> getProducts();

    void processProductEvents(ProductEvent productEvent);

}
