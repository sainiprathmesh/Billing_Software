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


}
