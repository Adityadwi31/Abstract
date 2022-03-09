package VMI;

class Parent {
int x = 5;

public void Info (){
    System.out.println("ini class parent");    
    
}
}
class Child extends Parent{
int x = 10;
public void Info (){
    super.Info();
    System.out.println("ini class Child");
}
}
public class VMI {
    public static void main(String[] args) {
        Parent tes = new Child();
        System.out.println("Nilai x = "+tes.x);
        tes.Info();
    }
}

