package rocks.zipcode.tripleDouble;

public class tripleDouble {
    public static int tripleDouble(Long num1,Long num2)
    {
       String n1= String.valueOf(num1);
       String n2 = String.valueOf(num2);
       for(int i=0;i<n1.length()-3;i++)
       {
           if(n1.charAt(i)==n1.charAt(i+1)&& n1.charAt(i)==n1.charAt(i+2))
           {
               for(int j=0;j<n2.length()-2;j++)
               {
                   if(n2.charAt(j)==n2.charAt(j+1) && n2.charAt(j)==n1.charAt(i))
                   {
                       return 1;
                   }
               }
           }
       }
       return 0;
    }
}
