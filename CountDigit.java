public class CountDigit {
  public static void main(String []args){
    int num=1234;
    int cnt=0;
    while(num>0){
      num=num/10;
      cnt++;
    }
    System.out.println("Number of digits: " + cnt);
  }
}
