package rocks.zipcode.IsNarcisstic;

import java.util.stream.Stream;

public class isNarc {
    public static boolean isNarcissistic(int number) {

        String sint = String.valueOf(number);
        int compareVal = 0;
        for(int i =0; i<sint.length(); i++)
        {
            compareVal+=Math.pow(Integer.parseInt(String.valueOf(sint.charAt(i))),sint.length());
        }
        if(compareVal==number)
        {
            return true;
        }
        return false;
        }
}
