package Test;
public class Teacher {
    String name,phone;
    int age;
     
    void setinfo(String n,String p,int a){
        name=n;
        phone=p;
        age=a;

    }
    
    void print(){
        System.out.println("Name: "+name);
        System.out.println("Phone Number: "+ phone);
        System.out.println("Age: "+ age);
        System.out.println();
    }
}

