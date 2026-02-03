import java.util.Scanner;
public class Operators {
  public static void main(String [] args){
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter First number:");
      int xx=sc.nextInt();
      System.out.println("Enter Second number:");
      int yy=sc.nextInt();
      System.out.println("Addition : "+(xx+yy));
      System.out.println("Subtraction : "+(xx-yy)); 
      System.out.println("Multiplication : "+(xx*yy));
      System.out.println("Division : "+(xx/yy));
    }
  }
}
