package PROJECTS;

import java.util.Scanner;

class CALCULATOR
{
    public static void main(String []xyz)
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2,result,choice;

        System.out.println("Enter first number:");
        num1=sc.nextInt();
        System.out.println("Enter second number:");
        num2=sc.nextInt();

        System.out.println("----MENU----");
        System.out.println("\nChoose Operation!");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        System.out.println("\n Enter choice: ");
        choice=sc.nextInt();

        switch(choice)
        {
            case 1:
            {
                result=num1+num2;
                System.out.println("Result:"+result);
                break;
            }
            case 2:
            {
                result=num1-num2;
                result = Math.abs(result); 
                System.out.println("Result:"+result);
                break;
            }
            case 3:
            {
                result=num1*num2;
                System.out.println("Result:"+result);
                break;
            }
            case 4:
            {
                if(num2!=0)
                {
                    result=num1/num2;
                    System.out.println("Result:"+result);
                }
                else
                {
                    System.out.println("Can't divided by num2!");
                }
            }
            default:
            {
                System.out.println("Default choice!");
            }
        }
        sc.close();
    }
}