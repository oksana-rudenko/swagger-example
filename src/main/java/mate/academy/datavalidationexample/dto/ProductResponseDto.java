package mate.academy.datavalidationexample.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Data
public class ProductResponseDto {
    private Long id;
    private String title;
    private BigDecimal price;
}
