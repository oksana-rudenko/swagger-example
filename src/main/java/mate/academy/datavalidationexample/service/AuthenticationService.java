package mate.academy.datavalidationexample.service;

import mate.academy.datavalidationexample.dto.CreateProductRequestDto;
import mate.academy.datavalidationexample.dto.ProductResponseDto;
import mate.academy.datavalidationexample.dto.RegisterUserRequestDto;
import mate.academy.datavalidationexample.dto.UserDto;

import java.util.List;

public interface AuthenticationService {
    UserDto register(RegisterUserRequestDto registerUserRequestDto);
}
