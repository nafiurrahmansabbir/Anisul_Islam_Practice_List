package Abstraction;

public class Intterface {
    public static void main(String[] args){
        Dog d=new Dog();
        d.eat();
    }
    
}

interface Animal{
    abstract void eat();
}
interface Fish{
    abstract void f();
}
class Dog implements Animal,Fish{
    public void eat(){
        System.out.println("Dog's eat biscuit.");
    }
    public void f(){

    }
}