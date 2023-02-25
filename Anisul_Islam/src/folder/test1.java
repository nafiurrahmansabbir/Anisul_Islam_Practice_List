package folder;

public class test1 {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.name="Sabbir";
        t1.phone="01726-665810";
        t1.age=22;
        t1.print();

        Teacher t2=new Teacher();
        t2.name="Nafiur Rahman";
        t2.phone="01862-056021";
        t2.age=23;
        t2.print();

        Teacher t3=new Teacher();
        t3.setinfo("Auntu","018838383",40);
        t3.print();

    }
}
class Teacher {
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
