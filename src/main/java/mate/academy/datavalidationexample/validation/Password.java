package mate.academy.datavalidationexample.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PasswordValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {
    String message() default "Field values don't match";

    String password();

    String repeatPassword();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
