import java.util.Scanner;
class BinarYSearch
{
    public static void main(String XYZ[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched:");
        int value=sc.nextInt();
        int low=0,high=n-1;
        int mid;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==value)
            {
                System.out.println("Element found at position:"+mid);
                break;
            }
            else if(arr[mid]>value)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        if(low>high)
        {
            System.out.println("Element not found!");
        }
    }
}