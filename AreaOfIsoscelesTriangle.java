class AreaOfIsoscelesTriangle {
  public static void main(String[] args){
    double equalSide=5.0;
    double base=6.0;
    double height=Math.sqrt(equalSide*equalSide - (base*base)/4);
    double area=0.5*base*height;
    System.out.println("Area of the isosceles triangle is: "+area);
  } 
}