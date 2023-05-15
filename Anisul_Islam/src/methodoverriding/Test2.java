package methodoverriding;

public class Test2 {
    public static void main(String[] args){
        BMW a=new BMW();
        a.display();

    }
    
}
class Car{
    public void display(){
        System.out.println("Car colour is red");
    }
}
class BMW extends Car{
    @Override
    public void display(){
        super.display();
    }

}