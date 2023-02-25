package Abstraction;

public class Test {
    
    public static void main(String[] args) {
        MobileUser obj;
        obj=new Sabbir();
        obj.sendmessage();
        obj=new Auntu();
        obj.sendmessage();
                
    }
    
}
abstract class MobileUser{
    abstract void sendmessage();

}
class Sabbir extends MobileUser{
    void sendmessage(){
        System.out.println("Hi Sabbir!");
    }
}
class Auntu extends MobileUser{
    void sendmessage(){
    System.out.println("Hi Auntu!");
    }
}
