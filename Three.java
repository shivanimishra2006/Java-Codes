class  Three
{
    public static void main(String XYZ[])
    {
        int n1=23;
        int n2=90;
        int n3=888;
        int result;
        result=(n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
        System.out.println("The greatest no. from the three no.'s is"+result);
    };
};