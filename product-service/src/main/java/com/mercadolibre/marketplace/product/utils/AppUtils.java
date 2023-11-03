package com.mercadolibre.marketplace.product.utils;

import org.springframework.beans.BeanUtils;

import com.mercadolibre.marketplace.product.dto.ProductDto;
import com.mercadolibre.marketplace.product.entity.Product;

public class AppUtils {


    public static ProductDto entityToDto(Product product) {
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        return productDto;
    }

    public static Product dtoToEntity(ProductDto productDto) {
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        return product;
    }
}
