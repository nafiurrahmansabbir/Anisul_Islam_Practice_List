package methodoverriding;

public class Test {
    public static void main(String[] args) {
        Nafiur obj1=new Nafiur();
        obj1.display();
    }
    
}

class Sabbir{
    int x=5;
    void display(){
        System.out.println("Sabbir");

    }

}
class Nafiur extends Sabbir{
    int x=10;
    @Override
    void display(){
        super.display();
        System.out.println("nafiur");
    }
}