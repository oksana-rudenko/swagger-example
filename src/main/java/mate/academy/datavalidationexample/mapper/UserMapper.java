package mate.academy.datavalidationexample.mapper;

import mate.academy.datavalidationexample.config.MapperConfig;
import mate.academy.datavalidationexample.dto.RegisterUserRequestDto;
import mate.academy.datavalidationexample.dto.UserDto;
import mate.academy.datavalidationexample.model.User;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface UserMapper {
    UserDto toDto(User user);

    User toEntity(RegisterUserRequestDto registerUserRequestDto);
}
