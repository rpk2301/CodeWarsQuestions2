package rocks.zipcode.SplitStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitStrings {

    public static String[] solution(String s) {
        ArrayList<String> ret = new ArrayList<>();
    if(s.length()%2==0)
    {
        for(int i=0;i<s.length();i+=2)
        {
            String adding="";
            adding+=s.charAt(i);
            adding+=s.charAt(i+1);
            ret.add(adding);
        }
    }
    else
    {
        for(int i=0;i<s.length();i+=2)
        {
            String adding="";
            adding+=s.charAt(i);
            if(i!=s.length()-1) {
                adding += s.charAt(i + 1);
            }
            else
            {
                adding+="_";
            }
            ret.add(adding);
        }
    }
    return ret.toArray(new String[ret.size()]);
    }

}
