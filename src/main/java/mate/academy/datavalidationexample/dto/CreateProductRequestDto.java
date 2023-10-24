package mate.academy.datavalidationexample.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Data
public class CreateProductRequestDto {
    @NotNull
    private String title;
    @NotNull
    @Min(0)
    private BigDecimal price;
}
