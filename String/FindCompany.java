public class FindCompany {
  public static void main(String[] args) {
    String email1="gangwarratnesh124@gmail.com";
    String email1Arr[]=email1.split("@");
    String lastPart= email1Arr[email1Arr.length-1];
    int dotIndex=lastPart.indexOf(".");
    System.out.println("Company of email1: "+lastPart.substring(0, dotIndex));
   
} 
}
