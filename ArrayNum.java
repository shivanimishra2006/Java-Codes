import java.util.Scanner;
class ArrayNum
{
    public static void main(String XYZ[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
    }
}