//armstong number
import java.util.Scanner;
class ArmsNum
{
    public static void main(String XYZ[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("plzz enter the number:");
        int num=sc.nextInt();
       // int num=153;
        int temp,rem,res=0;
        temp=num;
        while(num!=0)
        {
            rem=num%10;
            res=res+rem*rem*rem;
            num=num/10;
        }
        if(temp==res)
        {
            System.out.println("GIVEN NUMBER IS ARMSTRONG NUMBER!");
        }
        else
        {
            System.out.println("GIVEN NUMBER IS NOT ARMSTRONG NUMBER!");
        }
    }
}