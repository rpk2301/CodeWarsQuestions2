package rocks.zipcode.GoodVsEvil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GoodVsEvil {

    public static String battle(String goodAmounts, String evilAmounts)
    {
        int goodCount = 0;
        int evilCount= 0;
       List<String> ret = Arrays.stream(goodAmounts.split(" ")).toList();
       List<Integer> altered =ret.stream().map(x->Integer.parseInt(x)).collect(Collectors.toList());
       List<String> ret2 = Arrays.stream(evilAmounts.split(" ")).toList();
       List<Integer> altered2 =ret2.stream().map(x->Integer.parseInt(x)).collect(Collectors.toList());
       for(int i=1;i<=5;i++) {
           if (i == 1) {
               altered.set(i, altered.get(i) * 2);
           } else if (i == 2) {
               altered.set(i,altered.get(i) * 3);
           } else if (i == 3) {
               altered.set(i, altered.get(i) * 3);
           } else if (i == 4) {
               altered.set(i, altered.get(i) * 4);
           } else if (i == 5) {
               altered.set(i, altered.get(i) * 10);
           }
       }
        for(int i=1;i<=6;i++) {
            if (i == 1) {
                altered2.set(i, altered2.get(i) * 2);
            } else if (i == 2) {
                altered2.set(i, altered2.get(i) * 2);
            } else if (i == 3) {
                altered2.set(i, altered2.get(i) * 2);
            } else if (i == 4) {
                altered2.set(i, altered2.get(i) * 3);
            } else if (i == 5) {
                altered2.set(i, altered2.get(i) * 5);
            }
            else if (i == 6) {
                altered2.set(i, altered2.get(i) * 10);
            }
        }
           for(Integer x : altered)
           {
               goodCount+=x;
           }
        for(Integer x : altered2)
        {
            evilCount+=x;
        }
        if(goodCount>evilCount)
        {
            System.out.println("Good");
            return "Battle Result: Good triumphs over Evil";
        }
        else if (evilCount>goodCount)
        {
            System.out.println("bad");
            return "Battle Result: Evil eradicates all trace of Good";
        }
       return "Battle Result: No victor on this battle field";

    }

}

