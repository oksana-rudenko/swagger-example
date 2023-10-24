package mate.academy.datavalidationexample.dto;

import lombok.Data;
import mate.academy.datavalidationexample.validation.Email;
import mate.academy.datavalidationexample.validation.Password;

@Data
@Password(
        password = "password",
        repeatPassword = "repeatPassword",
        message = "Your password shouldn't be empty and should match repeatPassword"
)
public class RegisterUserRequestDto {
    @Email
    private String email;
    private String password;
    private String repeatPassword;
}
