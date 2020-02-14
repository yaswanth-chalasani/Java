class Water 
{
    void solid()
    {
     System.out.println("0 C");
    }
    void liquid()
    {
        System.out.println("1 c to 60 c");
    }
    void gaseous()
    {
        System.out.println("above 60 C");
    }
}
class TestWater{
public static void main(String[] args) {
 Water v= new Water();
 v.liquid();
 v.solid();
 v.gaseous();   
}
}