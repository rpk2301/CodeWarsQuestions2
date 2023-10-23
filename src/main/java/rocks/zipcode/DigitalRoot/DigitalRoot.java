package rocks.zipcode.DigitalRoot;

public class DigitalRoot {

    public static int digital_root(int n) {

        String sint = String.valueOf(n);
        int compareVal = 0;
        for (int i = 0; i < sint.length(); i++) {
            compareVal += (Integer.parseInt(String.valueOf(sint.charAt(i))));
        }
        if (String.valueOf(compareVal).length() != 1) {
           return digital_root(compareVal);
        }
        System.out.println(compareVal);
        return compareVal;
    }
}



