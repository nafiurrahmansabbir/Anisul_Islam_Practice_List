package encapsulation;

import java.util.Scanner;

public class test {
    static Encapsulation e1;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // System.out.print("Enter Name: ");
        // String name=input.nextLine();
        // System.out.print("Enter Age: ");
        // int age=input.nextInt();
        // input.close();

        e1=new Encapsulation();
        System.out.print("Enter Name: ");
        e1.setName(input.nextLine());
        System.out.print("Enter Age: ");
        e1.setAge(input.nextInt());
        e1.print();  
        input.close();
    }
}
class Encapsulation{
    private String Name;
    private int Age;

    void setName(String Name){
        this.Name=Name;

    }
    void setAge(int Age){
        this.Age=Age;
    }
    void print(){
        System.out.println();
        System.out.println("Wealcome "+Name+",sir!");
        if(Age>=18){
            System.out.println("Oh!Great.You are Adult.");
        }
        else{
            System.out.println("You are not Adult!");
        }
    }

}
