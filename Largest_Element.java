
import java.util.Scanner;
class Largest_Element
{
    public static void main(String[] atgs)
    {
        int a[]= new int[5];
        int max;
        int i;

        Scanner r = new Scanner(System.in);
        System.out.println("Enter an array element: ");

        for(i=0;i<5;i++)
        {
            a[i]=r.nextInt();
        }

        max=a[0];

        for(i=1;i<5;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Largest Element: "+ max);
    }
}