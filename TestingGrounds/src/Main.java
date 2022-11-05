public class Main {
    public static void main(String[] args) {
        String numberString = "509321967506747";
        char[] list = numberString.toCharArray();
        String fakeBinary = "";

        for (char c : list) {
            if (Character.getNumericValue(c) < 5) {
                fakeBinary = fakeBinary.concat("0");
            } else {
                fakeBinary = fakeBinary.concat("1");
            }
        }
    }
}