import java.util.Scanner;
public class ReverseNumber {
  public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
          System.out.println("Enter a number to reverse:"); 
          int num=sc.nextInt();
          while(num>0){
            int dig=num%10;
            num=num/10;
            System.out.print(dig);
          }
      }
  }
}
