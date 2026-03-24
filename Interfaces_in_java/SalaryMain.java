package Interfaces_in_java;

interface Employee
{
    void getDetails();
}
interface Salary
{
    void calculateSalary();
}
class Manager implements Employee,Salary
{
    String name;
    int id;
    double Salary;
    double bonus;
    public void getDetails()
    {
        System.out.println("Manager name:"+name);
        System.out.println("Manager id:"+id);
    }
    public void calculateSalary()
    {
        double totalSalary=Salary+bonus;
        System.out.println("Total salary with bonus:"+totalSalary);
    }
}

class SalaryMain
{
    public static void main(String XYZ[])
    {
        Manager mg=new Manager();
        mg.name="Rohan";
        mg.id=4678;
        mg.Salary=100000;
        mg.bonus=15000;

        mg.getDetails();
        mg.calculateSalary();
    }
}