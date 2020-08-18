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


}
