
public class SecondLargest {

    public static void main(String[] args)
    {
        int arr[]={1,5,9,55,8,-1,3,55};

        int n=arr.length;
        int highest= Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;

        for(int i=0; i<n; i++)
        {
            if(arr[i]> highest)
            {
                secondLargest= highest;
                highest = arr[i];
            }
            if(arr[i] < highest && arr[i]>secondLargest)
            {
                secondLargest= arr[i];
            }
        }
        System.out.println("Second Largest Element ia: "+secondLargest);

    }
    
}
