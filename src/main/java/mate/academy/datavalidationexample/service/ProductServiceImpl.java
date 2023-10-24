package mate.academy.datavalidationexample.service;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import mate.academy.datavalidationexample.dto.CreateProductRequestDto;
import mate.academy.datavalidationexample.dto.ProductResponseDto;
import mate.academy.datavalidationexample.mapper.ProductMapper;
import mate.academy.datavalidationexample.model.Product;
import mate.academy.datavalidationexample.config.repository.ProductRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public List<ProductResponseDto> findAll() {
        return productRepository.findAll().stream()
                .map(productMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public ProductResponseDto save(CreateProductRequestDto product) {
        Product entity = productMapper.toEntity(product);
        return productMapper.toDto(productRepository.save(entity));
    }
}
