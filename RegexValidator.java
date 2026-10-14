package aihms;
import java.util.regex.Pattern;
public final class RegexValidator {
    private static final Pattern NAME = Pattern.compile("^[A-Za-z][A-Za-z .'-]{1,49}$");
    private static final Pattern PHONE = Pattern.compile("^[0-9]{10}$");
    private static final Pattern EMAIL = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    private RegexValidator() {}
    public static boolean isValidName(String s) { return s != null && NAME.matcher(s.trim()).matches(); }
    public static boolean isValidPhone(String s) { return s != null && PHONE.matcher(s.trim()).matches(); }
    public static boolean isValidEmail(String s) { return s != null && EMAIL.matcher(s.trim()).matches(); }
}
