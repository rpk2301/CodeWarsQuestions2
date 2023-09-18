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
                case 'd': ret--;break;
                case 'i': ret++;break;
                case 'o': arr.add(ret);break;
                case 's': ret=(int)Math.pow(ret,2);break;
                default:System.out.println("Invalid Expression");break;
            }
        }
        int[] returnedArray = new int[arr.size()];
        for(int i=0;i<arr.size();i++)
        {
            returnedArray[i]=arr.get(i);
        }
        return returnedArray;
    }}