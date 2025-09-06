public class Circle{
  double radius;
  public Circle() {};
  public Circle(double r) {
    radius = r;
  };

  public double getCircumference() {
    return 2 * 3.14 * radius;
  }

  public static void main(String args[]) {
    Circle c1 = new Circle(2);
    double circumfer = c1.getCircumference();
    System.out.println("The circumferene of circle is " + circumfer);
  }

}


