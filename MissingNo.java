public class MissingNo {

    public static void main(String[] args)
    {
        int[] arr={ 1,3,7,4,2,6,8,9};
        int n= arr.length+1;

        int sum = (n*(n+1))/2;
        for(int i=0; i<arr.length; i++)
        {
            sum= sum -  arr[i];
        } 

        System.out.println("Missing no is: "+sum);
    }
    
}
