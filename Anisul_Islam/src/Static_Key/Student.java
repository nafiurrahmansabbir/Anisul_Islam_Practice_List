package Static_Key;
class Test {
    public static void main(String[] args) {
        Student s1=new Student("Sabbir",221);
        s1.print();
        Student s2=new Student("Auntu",221434);
        s2.print();
        System.out.println(Student.university);
    }
    
}

public class Student {
    String name;
    int id;
    static String university="DIU.";

    Student(String n,int i){
        name=n;
        id=i;
    }
    void print(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("University name: "+university);
        System.out.println();
    }
}



