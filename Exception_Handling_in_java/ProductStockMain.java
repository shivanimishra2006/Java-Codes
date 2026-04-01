package Exception_Handling_in_java;

class OutofStockException extends Exception
{
    public void Display()
    {
        System.out.println("Stock Full!");
    }
}
class Product
{
    String name;
    double price;
    int stock;

    void buy(int quantity) throws OutofStockException
    {
        if(quantity<stock)
        {
            stock-=quantity;
            double total=price*quantity;
            System.out.println(quantity+"total:"+total);
        }
        else
        {
            throw new OutofStockException();
        }
    }
}
class DiscountProduct extends Product
{
    @Override
    void buy(int quantity) throws OutofStockException
    {
        if(quantity<stock)
        {
            double discount=0.25;
            double Fprice=price-(price*discount);
            stock-=quantity;
            double f=Fprice*quantity;
            System.out.println(quantity+"total:"+f);
        }
    }
}
class ProductStockMain
{
    public static void main(String XYZ[])
    {
        Product pd=new Product();
        pd.name="SHIVI";
        pd.price=20000;
        pd.stock=10;

        DiscountProduct dps=new DiscountProduct();
        dps.name="Rohit";
        dps.price=50000;
        dps.stock=15;

        try
        {
            pd.buy(5);
            dps.buy(8);
        }
        catch(OutofStockException ose)
        {
            ose.Display();
        }
        catch(Exception e)
        {
            System.out.println("Exception found!"+e.getMessage());
        }
    }
}