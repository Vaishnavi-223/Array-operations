
import java.util.*;

public class Maximum_occu_char 
{
    
    static char getMaxOccurringChar(String str) {
         
        HashMap<Character, Integer> mp = new HashMap<>();

        int n = str.length(); 
        char ans = 0;
       
        int cnt = 0;
        for(int i = 0; i < n; i++) 
        {
            char c = str.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0) + 1);

            if(cnt < mp.get(c)) {
                ans = c;
                cnt = mp.get(c);
            }
        }
         
        return ans;
    }
    public static void main(String[] args) {
        String str = "vaishnavi";
        System.out.println("Max occurring character is: " + getMaxOccurringChar(str));
    }
}
 
