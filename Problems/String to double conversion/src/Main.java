class Converter {

    /**
     * It returns a double value or 0 if an exception occurred
     */
    public static double convertStringToDouble(String input) {
        try {
            double number = Double.parseDouble(input);
            return number;
        }
        catch (Exception e) {
            return 0;
        }
    }
}