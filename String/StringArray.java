public class StringArray {
  public static void main(String[] args) {
    String myLocations="noida ,Delhi ,chennai ,kolkata";
    String[] locations=myLocations.split(",");
    for(int i=0;i<locations.length;i++){
        System.out.println(locations[i].trim());
    }
    
  }
}
