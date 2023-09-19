package rocks.zipcode.FindTheOddInt;

import java.util.HashMap;
import java.util.Map;

public class FindTheOddInt {


    public static int findIt(int[] a) {
        HashMap<Integer,Integer> nums = new HashMap<>();
        for(int num: a)
        {
            if(!nums.containsKey(num))
            {
                nums.put(num,1);
            }
            else
            {
                int current = nums.get(num);
                nums.put(num,current+1);
            }
        }
        for(Map.Entry<Integer,Integer> ents: nums.entrySet())
        {
            if(ents.getValue()%2!=0)
            {
                return ents.getKey();
            }
        }
        return 0;
    }
}
