package mate.academy.datavalidationexample.service;

import lombok.RequiredArgsConstructor;
import mate.academy.datavalidationexample.dto.RegisterUserRequestDto;
import mate.academy.datavalidationexample.dto.UserDto;
import mate.academy.datavalidationexample.mapper.UserMapper;
import mate.academy.datavalidationexample.model.User;
import mate.academy.datavalidationexample.config.repository.UserRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserDto register(RegisterUserRequestDto registerUserRequestDto) {
        User user = userMapper.toEntity(registerUserRequestDto);
        return userMapper.toDto(userRepository.save(user));
    }
}
