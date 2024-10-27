

public class Single_Number {
    
    
    static int findSingle(int[] arr) {
      
   
        for (int i = 0; i < arr.length; i++) {
          
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
            
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //int[] arr = { 2, 3, 5, 4, 5, 3, 4 };
        int[] arr = { 4,1,2,1,2 };
        System.out.println(findSingle(arr));
    }
}