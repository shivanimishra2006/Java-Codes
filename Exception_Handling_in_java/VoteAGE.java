package Exception_Handling_in_java;


import java.util.Scanner;
import java.lang.Exception;
class VoteAGE 
{
    public static void main(String XYZ[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the age:");
        int age = sc.nextInt();
        if (age >= 18) 
        {
            throw new Exception("Eligible to vote!");
        } 
        else 
        {
            throw new Exception("Not eligible to vote!");
        }
    }
}