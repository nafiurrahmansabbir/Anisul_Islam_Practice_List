package Constractor;
public class Teacher1 {
    String name;
    int age;
    Teacher1(){
        System.out.println("No Value");
        System.out.println();
    }
    Teacher1(String n,int a){
        name=n;
        age=a;
    }
    void print(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println();
    }
}
