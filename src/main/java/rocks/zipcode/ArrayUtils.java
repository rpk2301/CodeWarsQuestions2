package rocks.zipcode;

public class ArrayUtils {
    public static String seeEverything(String[] input)
    {
        StringBuilder sb = new StringBuilder();
        for(String s: input) {

          sb.append(s);
          sb.append(" ");

        }
        return sb.toString();
        }


}
