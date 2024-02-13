public class StackHeap {
    public static void main(String[] args){
        Calculator obj=new Calculator();
        int r1=obj.add(4,5);
        System.out.println(r1);
        System.out.println(obj.num);

    }
}
class Calculator{
    int num=5;
    public int add(int n1,int n2){
        int r1=n1+n2;
        return r1;
  

    }
}
