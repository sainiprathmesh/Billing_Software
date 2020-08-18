package validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author prathmeshkumarsaini on 18/08/20
 */
public class Validations {
    private Pattern email;
    private Pattern name;
    private Pattern password;
    private Pattern phone;
    private Matcher matcher;
    private static final String NAME_PATTERN = "^[A-Za-z]{3,25}$";
    private static final String PHONE_PATTERN = "^[0-9]{10}$";
    private static final String PASS_PATTERN = "^[A-Za-z0-9]{3,25}$";
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z-]+(\\.[A-Za-z]+)*(\\.[A-Za-z]{2,3})$";

    public Validations() {
        email = Pattern.compile(EMAIL_PATTERN);
        name = Pattern.compile(NAME_PATTERN);
        password = Pattern.compile(PASS_PATTERN);
        phone = Pattern.compile(PHONE_PATTERN);
    }

    public boolean emailValidate(final String email1) {
        matcher = email.matcher(email1);
        return matcher.matches();
    }

    public boolean nameValidate(final String name1) {
        matcher = name.matcher(name1);
        return matcher.matches();
    }

    public boolean passValidate(final String pass1) {
        matcher = password.matcher(pass1);
        return matcher.matches();
    }

    public boolean phoneValidate(final String phone1) {
        return matcher.matches();
    }
}
