package inheritence;
import java.util.Scanner;

public class Test {
    static Son s1;
    public static void main(String[] args){
        s1=new Son();
        Scanner sc=new Scanner(System.in);
        s1.name=sc.nextLine();
        s1.age=sc.nextInt();
        sc.close();
        s1.display1();
        s1.display2();
        
        
    }  
}
class Father{
    String name;
    int age;
    void display2(){
        System.out.println("Father Class");
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
    }
}
class Son extends Father{
    void display1(){
        //super.display2();
        System.out.println("Son Class");
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
    }
}