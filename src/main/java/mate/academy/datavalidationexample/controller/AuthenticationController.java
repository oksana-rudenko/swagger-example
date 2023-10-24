package mate.academy.datavalidationexample.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import mate.academy.datavalidationexample.dto.RegisterUserRequestDto;
import mate.academy.datavalidationexample.dto.UserDto;
import mate.academy.datavalidationexample.service.AuthenticationService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto create(@RequestBody @Valid RegisterUserRequestDto requestDto) {
        return authenticationService.register(requestDto);
    }
}
