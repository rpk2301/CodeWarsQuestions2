package rocks.zipcode.Container;

public class Container {


    public static int maxArea(int[] height)
    {
    int maxArea =0;
      for(int i=0; i<height.length;i++)
      {
          for(int z=0;z<height.length;z++)
          {
              if(height[i]*Math.abs(z-i)>=maxArea && z!=i && height[z]>=height[i])
              {
                 int localMax=Math.abs(z-i)*height[i];
                 if(localMax>maxArea)
                 {
                     maxArea=localMax;
                 }
              }
          }
      }
      System.out.println(maxArea);
    return maxArea;
    }








}
