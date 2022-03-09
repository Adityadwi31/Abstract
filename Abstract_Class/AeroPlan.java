package Abstract_Class;

public class AeroPlan extends Vehicle {

    @Override
    public void walk() {
        System.out.println("Aeroplan Flying");
    }

    public static void main(String[] args) {
       
        AeroPlan garuda = new AeroPlan();
        garuda.funtion();
        garuda.fuel();
        garuda.walk();

    }

}
