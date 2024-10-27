import java.util.ArrayList;
import java.util.List;

public class UnionOfSortedArrays {
    public static List<Integer> findUnion(int[] a, int[] b) {
        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            
            while (i > 0 && i < a.length && a[i] == a[i - 1]) {
                i++;
            }
           
            while (j > 0 && j < b.length && b[j] == b[j - 1]) {
                j++;
            }
            
            if (i >= a.length || j >= b.length) break;

           
            if (a[i] < b[j]) {
                union.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                union.add(b[j]);
                j++;
            } else { 
                union.add(a[i]);
                i++;
                j++;
            }
        }

        
        while (i < a.length) {
            if (i == 0 || a[i] != a[i - 1]) {
                union.add(a[i]);
            }
            i++;
        }

        
        while (j < b.length) {
            if (j == 0 || b[j] != b[j - 1]) {
                union.add(b[j]);
            }
            j++;
        }

        return union;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 3, 5, 5, 6};
        
        List<Integer> union = findUnion(a, b);
        System.out.println("Union of the arrays: " + union);
    }
}