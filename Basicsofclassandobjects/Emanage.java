class Employee
{
    String name;
    double salary;
    void display()
    {
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Slary:"+salary);
    }
}
class Manager extends Employee
{
    void manageTeam()
    {
        System.out.println(name+" "+" is managing the team.");
    }
}
class Emanage
{
    public static void main(String XYZ[])
    {
        Manager mn=new Manager();
        mn.name="AMAN";
        mn.salary=50000.90;

        mn.display();
        mn.manageTeam();
    }
}