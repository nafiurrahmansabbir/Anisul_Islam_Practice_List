package folder;

public class Practic1 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.totalM();
        Student s2=new Student();
        s2.totalM();
        Student s3=new Student();
        s3.totalM();  
    }    
}

class Student{
    static int count=0;
    Student(){
        count=count+1;
    }
    void totalM(){
        System.out.println("Total method is: "+count);
    }
}
