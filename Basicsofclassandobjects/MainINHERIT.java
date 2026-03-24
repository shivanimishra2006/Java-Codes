//Single Inheritance

class Stdudent
{
    String name;
    int RollNo;
    void displayStudentsDetails()
    {
        System.out.println("Student Name:"+name);
        System.out.println("Student Roll no:"+RollNo);
    }
}
class Result extends Stdudent
{
    float marks;
    char grade;
    void displayResult()
    {
        System.out.println("Student marks:"+marks);
        System.out.println("Student grade:"+grade);
    }
}
class MainINHERIT
{
    public static void main(String XYZ[])
    {
        Result res=new Result();
        res.name="ROHIT";
        res.RollNo=45;

        res.marks=90;
        res.grade='A';

        res.displayStudentsDetails();
        res.displayResult();

    }
}