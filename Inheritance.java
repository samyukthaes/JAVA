
class Calculator{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }

}
class AdvCalculator extends Calculator{
    public int mult(int n1,int n2){
        return n1*n2;
    }
    public int div(int n1,int n2){
        return n1/n2;
    }

}
public class Inheritance {
    public static void main(String[] args){

    AdvCalculator obj=new AdvCalculator();
    int r1=obj.add(3,4);
    int r2=obj.sub(10,5);
    int r3=obj.mult(3,4);
    int r4=obj.div(10,5);
    System.out.println(r1+" "+r2+" "+r3+" "+r4);

    }

    
}
