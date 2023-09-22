package rocks.zipcode.CanPlantFlower;

public class Assesment {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int count = 0;
            if (flowerbed.length > 1) {
                if (CheckRight(flowerbed, 0) && flowerbed[0] == 0) {
                    count++;
                    flowerbed[0] = 1;
                }
                for (int i = 1; i < flowerbed.length - 1; i++) {
                    if (CheckRight(flowerbed, i) && CheckLeft(flowerbed, i) && flowerbed[i] == 0) {
                        count++;
                        flowerbed[i] = 1;
                    }
                }
                if (CheckLeft(flowerbed, flowerbed.length - 1) && flowerbed[flowerbed.length - 1] == 0) {
                    count = count + 1;
                    flowerbed[flowerbed.length - 1] = 1;
                }
                if (count >= n) {
                    return true;
                }
            }
            else if (flowerbed.length==1)
            {
                if (flowerbed[0]==0 || n==0)
                {
                    return true;
                }
                return false;
            }
            return false;
        }

public boolean CheckRight(int[]flowerBed, int n)
{
    if (flowerBed[n+1]==0)
    {
        return true;
    }
    return false;
}

public boolean CheckLeft(int[]flowerBed, int n)
{
    if(flowerBed[n-1]==0)
    {
        return true;
    }
    return false;
}

}
