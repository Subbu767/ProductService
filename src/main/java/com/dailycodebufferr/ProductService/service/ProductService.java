package com.dailycodebufferr.ProductService.service;

import com.dailycodebufferr.ProductService.model.ProductRequest;
import com.dailycodebufferr.ProductService.model.ProductResponse;

public interface ProductService {
    Long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
