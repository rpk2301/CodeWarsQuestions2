package rocks.zipcode.SumString;

public class SumString {

    public static String sumStrings(String a, String b) {
        String ret = "";
        for (int i = 0; i < a.length(); i++)
        {
            if(i<b.length())
            {
               ret+= String.valueOf(Integer.parseInt(String.valueOf(a.charAt(i)))+Integer.parseInt(String.valueOf(b.charAt(i))));
            }
        }
        if(b.length()>a.length())
        {
            for(int i=a.length();i>b.length();i++)
            {
                ret+=b.charAt(i);
            }
        }
        return ret;
    }
}
