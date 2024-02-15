public class statVariable{
    public static void main(String[] args){

        Mobile obj1=new Mobile();
        obj1.brand="xyz";
        obj1.price=1000;
        Mobile.name="phone";

        obj1.show();


    }

}
class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(name+":"+brand+":"+price);
    }
}