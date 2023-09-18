package rocks.zipcode.DeadFish;

import java.util.ArrayList;

public class DeadFish {

    public static int[] parse(String data) {
       int ret=0;
       ArrayList<Integer> arr = new ArrayList<>();
       for(int i=0;i<data.length();i++)
       {
           if(data.charAt(i)=='i'){ ret++;}
           else if(data.charAt(i)=='d'){ ret--;}
           else if(data.charAt(i)=='s'){ ret = (int) Math.pow(ret,2);}
           else if(data.charAt(i)=='o'){ arr.add(ret);}
       }
      int[] returnedArray = new int[arr.size()];
       for(int i=0;i<arr.size();i++)
       {
           returnedArray[i]=arr.get(i);
       }
return returnedArray;
}}
