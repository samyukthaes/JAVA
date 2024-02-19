public class constrctr {
    public static void main(String[] args){

        Human obj=new Human();
        Human obj1=new Human(30,"Sam");
        System.out.println(obj.getName()+":"+obj.getAge());
        System.out.println(obj1.getName()+":"+obj1.getAge());

        obj.setAge(30);
        obj.setName("Sam");
        
    //    System.out.println(obj.getName()+":"+obj.getAge());



    }
}
class Human{
    int age;
    String name;

    public Human(int age, String name) { //parameterized constructors
        this.age = age;
        this.name = name;
    }

    
    public Human() {  //default constructors
        age=12;
        name="sona";
    }


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

 