package mate.academy.datavalidationexample.service;

import mate.academy.datavalidationexample.dto.CreateProductRequestDto;
import mate.academy.datavalidationexample.dto.ProductResponseDto;

import java.util.List;

public interface ProductService {
    List<ProductResponseDto> findAll();

    ProductResponseDto save(CreateProductRequestDto product);
}
