package distance;

public class DistanceConverter {

    public static double convertDistance(double value, String fromUnit, String toUnit) {
        if (fromUnit.equals("meter") && toUnit.equals("km")) {
            return value / 1000;
        } else if (fromUnit.equals("km") && toUnit.equals("meter")) {
            return value * 1000;
        } else if (fromUnit.equals("mile") && toUnit.equals("km")) {
            return value * 1.60934;
        } else if (fromUnit.equals("km") && toUnit.equals("mile")) {
            return value / 1.60934;
        }
        return -1; 
    }
}
