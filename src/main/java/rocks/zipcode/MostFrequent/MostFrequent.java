package rocks.zipcode.MostFrequent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MostFrequent {


    public static List<String> top3(String s) {
        String regex = "[\\s\\p{P},]";
        String[] parts = s.split(regex);
        HashMap<String,Integer> words = new HashMap();
        for(String z: parts) {
            if (words.containsKey(z) && !z.isEmpty()) {
                words.put(z, words.get(z) + 1);
            } else if (!z.isEmpty()) {
                words.put(z, 1);
            }
        }
        ArrayList<String> ret = new ArrayList();
        int i=0;
        while(i<3) {
            int localmax =0;
            String localKey = "";
            for (String m : words.keySet()) {
            if(words.get(m)>localmax){
                localmax = words.get(m);
                localKey = m;
            }
            }
            ret.add(localKey);
            words.remove(localKey);
            i++;
        }
        for(String p: ret)
        {
            System.out.println(p);
        }
        return  ret;
    }
}
