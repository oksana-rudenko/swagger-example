package mate.academy.datavalidationexample.controller;

import java.util.List;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import mate.academy.datavalidationexample.dto.CreateProductRequestDto;
import mate.academy.datavalidationexample.dto.ProductResponseDto;
import mate.academy.datavalidationexample.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponseDto save(@RequestBody @Valid CreateProductRequestDto product) {
        return productService.save(product);
    }

    @GetMapping
    public List<ProductResponseDto> findAll() {
        return productService.findAll();
    }
}
