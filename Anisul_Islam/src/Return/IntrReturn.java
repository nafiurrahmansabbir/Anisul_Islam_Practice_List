package Return;

public class IntrReturn {
    public static void main(String[] args) {
        s s1=new s();
        int result= s1.v(5);
        System.out.println(result);
    }
    
}
class s{
    int v(int a){
        return a*a;
    }
}
