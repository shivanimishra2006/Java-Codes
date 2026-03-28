package Exception_Handling_in_java;

import java.io.IOException;

class SuperClass
{
    void display() throws IOException
    {
        System.out.println("SuperClass method run!");
    }
}

class SubClass extends SuperClass
{
    @Override
    void display() throws IOException
    {
        System.out.println("SubClass method run!");
    }
}

class ChildpcMain
{
    public static void main(String XYZ[])
    {
        SuperClass obj = new SubClass();

        try
        {
            obj.display();
        }
        catch(IOException e)
        {
            System.out.println("IOException Found! " + e);
        }
        catch(Exception e)
        {
            System.out.println("General Exception: " + e);
        }
    }
}