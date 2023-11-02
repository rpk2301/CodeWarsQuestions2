package rocks.zipcode.ProductButSelf;

public class ProductButSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProds = new int[n];
        int[] rightProds = new int[n];
        int[] ret = new int[n];
        leftProds[0] = 1;
        rightProds[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            rightProds[i] = rightProds[i - 1] * nums[i - 1];
        }
        for (int i = n - 2; i > -1; i--) {
            leftProds[i] = leftProds[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            ret[i] = rightProds[i] * leftProds[i];
        }
        return ret;
    }
}
