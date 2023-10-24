package mate.academy.datavalidationexample.mapper;

import mate.academy.datavalidationexample.config.MapperConfig;
import mate.academy.datavalidationexample.dto.CreateProductRequestDto;
import mate.academy.datavalidationexample.dto.ProductResponseDto;
import mate.academy.datavalidationexample.model.Product;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface ProductMapper {
    ProductResponseDto toDto(Product product);

    Product toEntity(CreateProductRequestDto requestDto);
}
