package rocks.zipcode.DeadFish;

import java.util.ArrayList;

public class DeadFish {

    public static int[] parse(String data) {
       int ret=0;
       ArrayList<Integer> arr = new ArrayList<>();
       for(char charcter: data.toCharArray())
       {
         switch (charcter)
         {
             case 'd': ret--;
             case 'i': ret++;
             case 'o': arr.add(ret);
             case 's': ret=(int)Math.pow(ret,2);
             default: throw new IllegalArgumentException("Invalid Character");
         }
       }
      int[] returnedArray = new int[arr.size()];
       for(int i=0;i<arr.size();i++)
       {
           returnedArray[i]=arr.get(i);
       }
return returnedArray;
}}
