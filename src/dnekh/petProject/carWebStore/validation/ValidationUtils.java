package dnekh.petProject.carWebStore.validation;

import java.time.Year;
import java.util.regex.Pattern;

public class ValidationUtils {

    private static final Pattern VIN_PATTERN = Pattern.compile("^[^ioq]{17}$", Pattern.CASE_INSENSITIVE);

    public static boolean isValidString(String value) {
        return value != null && !value.trim().isEmpty();
    }

    public static boolean isValidYear(int year) {
        int currentYear = Year.now().getValue();
        return year >= 1886 && year <= currentYear;
    }

    public static boolean isValidMileage(int mileage) {
        return mileage >= 0;
    }

    public static boolean isNotNull(Enum<?> value) {
        return value != null;
    }

    public static boolean isValidVIN(String vin) {
        if (vin == null) {
            return false;
        }
        return VIN_PATTERN.matcher(vin).matches();
    }
}
