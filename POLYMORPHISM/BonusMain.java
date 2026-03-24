package POLYMORPHISM;

class Employee
{
    void calculateSalary()
    {
        double salary=45000.90;
        System.out.println("Salary of employee:"+salary);
    }
}
class Manager extends Employee
{
    @Override
    void calculateSalary()
    {
        double salary=45000.90;
        double bonus=20000;
        double totalSalary=salary+bonus;
        System.out.println("Total Salary of Manager with bonus:"+totalSalary);
    }
}
class BonusMain
{
    public static void main(String XYZ[])
    {
        Employee ep=new Employee();
        ep.calculateSalary();

        Manager m=new Manager();
        m.calculateSalary();
    }
}