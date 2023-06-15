package Abstraction;

public class Abstract {
    
    public static void main(String[] args) {
        MobileUser obj;
        obj=new Sabbir();
        obj.sendmessage();
        obj=new Auntu();
        obj.sendmessage();
        obj.display();
                
    }
    
}
abstract  class MobileUser{
    //abstrac method
    abstract void sendmessage();
    //normal method
    void display(){
        System.out.println("Thats why I'm not 100% abstraction.");
    }
    
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
