
public class SubArray_sum_k {
    
    static int lenOfLongSubarr(int[] arr, int k) {
        int res = 0;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }

        return res;
    }

  
    public static void main(String[] args) {
        //int[] arr = {-1,2,3};
        //int k = 6;
        int[] arr = {10,5,2,7,1};
        int k = 15;
        System.out.println(lenOfLongSubarr(arr, k));
    }
}