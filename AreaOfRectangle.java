import java.util.Scanner;
public class AreaOfRectangle {
  public static void main(String[] args) {
      try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter length of rectangle:");
        double length=sc.nextDouble();
        System.out.println("Enter breadth of rectangle:");
        double breadth=sc.nextDouble();
        double area=length*breadth;
        System.out.println("Area of the rectangle is: "+area);
      }
  }
}
