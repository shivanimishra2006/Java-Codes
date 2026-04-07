// PUBLIC , PROTECTED AND DEFAULT ACCESS SPECIFIERS MEMBERS AND FUNCTON CAN ACCESS WITHIN THE OTHER CLASS AS WELL AS SAME PACKAGE BUT "PRIVATE" ACCESS SPECIFIER CANNOT BE ACCESSED IN DIFFRENT CLASS AS WELL AS THE SIMILAR PACKAGE
// ..........it is cleared in two different classes named as CAR and TRUCK.......

package Access_specifier_in_java;

class Truck 
{
    int tyre = 10;
}
class car
{
    public static void main(String aaa[])
    {
        Truck t=new Truck();
        System.out.println(t.tyre);
    }
}
