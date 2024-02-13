public class objArray {

    public static void main(String[] args) {
        Student s1=new Student();
        s1.marks=99;
        s1.name="Sam"; 
        
        Student s2=new Student();
        s2.marks=100;
        s2.name="Sona"; 

        Student students[]=new Student[2]; //Initializing array
        students[0]=s1;
        students[1]=s2;
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name+" : "+students[i].marks);
        }
       
    }
}
class Student{
    int marks;
    String name;
}