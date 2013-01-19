package ua.com.ups.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import ua.com.ups.entity.User;

/**
 * Validator for form registration.
 *
 * @author : Alex.Barchuk
 * Date: 03.12.12
 */

@Component
public class RegistrationValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "label.validate.emailEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "label.validate.passwordEmpty");
    }

}
