import java.util.Scanner;
class PalindromeNum
{
    public static void main(String XYZ[])
    {
        Scanner sc=new Scanner(System.in);
        /*System.out.println("ENTER THE ORIGINAL NUMBER:");*/
        int originalnum=sc.nextInt();
        int temp=originalnum;
        int rev=0;
        while(temp>0)
        {
            rev=(rev*10)+temp%10;
            temp=temp/10;
        }
        if(originalnum==rev)
        {
            System.out.println("GIVEN NUMBER IS PALINDROME!");
        }
        else
        {
            System.out.println("GIVEN NUMBER IS NOT PALINDROME!");
        }
    }
}