public class encap {
    public static void main(String[] args){

        Human obj=new Human();

        obj.setAge(30);
        obj.setName("Sam");
        
       System.out.println(obj.getName()+":"+obj.getAge());



    }
}
class Human{
    int age;
    String name;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        age=a;
    }
    public void setName(String n){
        name=n;
    }
}
