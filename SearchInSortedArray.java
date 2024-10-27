public class SearchInSortedArray {
    
    public static boolean isPresent(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            
            if (arr[mid] == k) {
                return true;
            }

            
            if (arr[mid] < k) {
                left = mid + 1;
            }
            
            else {
                right = mid - 1;
            }
        }
        
        
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,9};
        int k = 6;

        if (isPresent(arr, k)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
