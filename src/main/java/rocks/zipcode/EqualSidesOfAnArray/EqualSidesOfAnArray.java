package rocks.zipcode.EqualSidesOfAnArray;

public class EqualSidesOfAnArray {

    public static int findEvenIndex(int[] arr) {
        //Go through the entire array of numbers
        for (int i = 0; i < arr.length; i++) {
            if(checkLeft(arr,i) ==checkRight(arr,i))
            {
                return i;
            }
        }
        return -1;
    }

    public static int checkLeft(int[] arr, int i) {
        if (i > 0) {
            int sum = 0;
            for (int j = i - 1; j >= 0; j--)
            {
                sum += arr[j];
            }
            return sum;
        }
        return 0;
    }

    public static int checkRight(int[] arr, int i) {
        if (i < arr.length-1) {
            int sum = 0;
            for (int j = i +1; j < arr.length; j++) {
                sum += arr[j];
            }
            return sum;
        }
        return 0;
    }
}
