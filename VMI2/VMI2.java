
package VMI2;


class Vehicle {
    public void move () {
         System.out.println ("Vehicles are used for moving from one place to another ");
    }
}

class Car extends Vehicle {
    public void move () {
      super. move (); // invokes the super class method
      System.out.println ("Car is a good medium of transport ");
    }
}

public class VMI2 {
    public static void main (String args []){
        Vehicle panggil = new Car (); // Vehicle reference but Car object
        panggil.move (); //Calls the method in Car class
    }
}
