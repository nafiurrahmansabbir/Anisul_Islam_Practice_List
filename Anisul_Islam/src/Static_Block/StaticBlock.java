package Static_Block;

public class StaticBlock {
    static String name;
    static int id;
    static{
        name="Sabbir";
        id=221155871;

    }
    static void display(){
        System.out.println(name);
        System.out.println(id);
    }
    public static void main(String[] args) {
        StaticBlock.display();
    }
}
