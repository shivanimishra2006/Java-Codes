package Exception_Handling_in_java;


import java.util.Scanner;

class VotingAge {
    public static void main(String XYZ[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the age:");
        int age = sc.nextInt();

        try 
        {
            if (age >= 18) 
            {
                throw new Exception("Eligible to vote!");
            } 
            else 
            {
                throw new Exception("Not eligible to vote!");
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}