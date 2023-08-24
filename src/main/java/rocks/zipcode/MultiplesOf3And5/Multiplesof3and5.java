package rocks.zipcode.MultiplesOf3And5;

public class Multiplesof3and5 {

    public static int solution(int n) {
        if(n<0)
        {
            return 0;
        }
        int count =0;
        for(int i=0; i<n; i++)
        {
            if(i%3==0 && i%5==0)
            {
                count+=i;
            }
            else if(i%3==0)
            {
                count +=i;
            }
            else if(i%5==0)
            {
                count+=i;
            }
        }
        System.out.println(count);
        return count;
    }


}
