import java.util.Scanner;
public class DigitOfNumber {
  public static void main(String[] args) {
      
  
  try(Scanner sc=new Scanner(System.in)){
  System.out.println("Enter a number:");
  int number=sc.nextInt();
  int nod=0;
  int temp=number;
  while(temp>0){
    temp=temp/10;
    nod++;
  }
  int div=(int)Math.pow(10,nod-1);
  System.out.println("Digits of the number "+number+" are:");
  while(div>0){ 
    int digit=number/div;
    System.out.println(digit);
    number=number%div;
    div=div/10;
  }
  }
}
}
