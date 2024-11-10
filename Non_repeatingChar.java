public class Non_repeatingChar {
    
    static char nonRepeatingChar(String s) 
    {
        int n = s.length();

        for (int i = 0; i < n; ++i) 
        {
            boolean found = false;

            for (int j = 0; j < n; ++j) 
            {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (found == false) 
                return s.charAt(i);
        }
        return '$';
    }

    public static void main(String[] args) {
        //String s = "rrggff";
        String s = "geeksforgeeks";
      
        System.out.println(nonRepeatingChar(s));
    }
}
