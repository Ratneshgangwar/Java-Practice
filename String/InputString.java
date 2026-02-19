import java.util.Scanner;

class InputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("You entered: " + input);
        String s="Ratnesh Gangwar";
        System.out.println(s);
        System.out.println(s.length() ); // length of string
        System.out.println(s.toLowerCase()) ; // convert to lowercase
        System.out.println(s.toUpperCase()) ; // convert to uppercase
        System.out.println(s.charAt(0) ); // character at index 0
        System.out.println(s.indexOf('A') ); // index of first occurrence of 'a'
        System.out.println(s.indexOf("R") ); // index of 'a' starting from index 5
        System.out.println(s.substring(0, 7) ); // substring from index 0 to 6
        char[] charArray = s.toCharArray(); // convert string to char array
        for(int i=0;i<s.length();i++){
            System.out.print(charArray[i]+" ");
        }
System.out.println("Ratnesh".compareTo("Ratnesh"));
System.out.println("Ratnesh".compareTo("Ratn"));
System.out.println("Satnesh".compareTo("Aat")); 


    }
}