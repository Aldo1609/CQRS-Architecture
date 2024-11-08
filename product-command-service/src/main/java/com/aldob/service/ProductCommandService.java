package com.aldob.service;

import com.aldob.dto.ProductEvent;
import com.aldob.entity.Product;

public interface ProductCommandService {

    Product createProduct(ProductEvent productEvent);

    Product updateProduct(long id,ProductEvent productEvent);

}
