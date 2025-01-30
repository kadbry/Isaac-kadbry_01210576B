package time;

public class TimeConverter {

    public static double convertTime(double value, String fromUnit, String toUnit) {
        if (fromUnit.equals("hour") && toUnit.equals("minute")) {
            return value * 60;
        } else if (fromUnit.equals("minute") && toUnit.equals("hour")) {
            return value / 60;
        } else if (fromUnit.equals("hour") && toUnit.equals("second")) {
            return value * 3600;
        } else if (fromUnit.equals("second") && toUnit.equals("hour")) {
            return value / 3600;
        }
        return -1; 
    }
}
