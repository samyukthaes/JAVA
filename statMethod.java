public class statMethod {

    public static void main(String[] args){
        Mobile obj1=new Mobile();
        obj1.brand="xyz";
        obj1.price=900;
        Mobile.name="phone";

        obj1.show();
        Mobile.show1(obj1);


    }
}
class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(name+":"+brand+":"+price);
    }
    public static void show1(Mobile obj){
        System.out.println(name+":"+obj.brand+":"+obj.price);

    } 
}