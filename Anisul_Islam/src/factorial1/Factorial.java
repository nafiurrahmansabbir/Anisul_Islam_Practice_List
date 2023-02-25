package factorial1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\t\tFacttorial Program\n");
        System.out.print("Enter the number: ");
        int a=input.nextInt();
        input.close();
        Rec r=new Rec();
        int ans=r.fac(a);

        Factorial.display(ans);


        System.out.println("\tProgram End!\n\tThank You");
    }
    public static void display(int Ans){
        System.out.println("Ans is: " +Ans);
    }
}
class Rec{
    int fac(int n){
        if (n==1){
            return 1;
        }
        else{
           return n*fac(n-1);
        }
    }
}