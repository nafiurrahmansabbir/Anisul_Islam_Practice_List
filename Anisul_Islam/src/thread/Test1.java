package thread;

public class Test1 {
    public static void main(String[] args){
        MyClass o1=new MyClass();
        o1.start();
        o1.run();
    }
    
}
class MyClass extends Thread{
    int a=5;
    public void run(){
        try {
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
        }
        

    }

}
