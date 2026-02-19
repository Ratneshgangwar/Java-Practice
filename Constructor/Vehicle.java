public class Vehicle {
  String model;
  private int speed;

    public Vehicle() { //default constructor
      this.model = "Default";
      this.speed = 0;
    }
 public  Vehicle(String model, int speed) {//parameterized constructor
      this.model = model;
      this.speed = speed;
    }
    Vehicle(Vehicle that){
      this.model=that.model;
      this.speed=that.speed;
    }
    void displayInfo() {
      System.out.println("Model: " + model);
      System.out.println("Speed: " + speed);
    }
    public static void main(String[] args) {
      Vehicle v1 = new Vehicle();//using default constructor
      Vehicle v2 = new Vehicle("Toyota", 60);//using parameterized constructor
      Vehicle v3 = new Vehicle(v2);//using copy constructor
      v1.displayInfo();
      v2.displayInfo();
      v3.displayInfo();
    }
  
}
