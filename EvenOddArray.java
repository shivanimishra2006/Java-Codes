class EvenOddArray
{
    public static void main(String XYZ[])
    {
        for(int i=1;i<=50;i++)
        {
            if(i%2==0)
            {
                double p=i+(i*0.10);
                System.out.println(i+"-->Even"+p+"-->"+(i+p));
            }
            else
            {
                double p =i+(i*0.20);
                System.out.println(i+"-->odd"+p+"-->"+(i+p));
            }
        }
    }
}