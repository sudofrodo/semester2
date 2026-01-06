public class Rectangle {
  private double height;
  private double length;

  public Rectangle() {
  };

  public Rectangle(double h, double l) {
    height = h;
    length = l;
  }

  public double getArea() {
    return height * length;
  }

  public double getPerimeter() {
    return 2 * (height + length);
  }

  public static void main(String[] args) {
    Rectangle r1 = new Rectangle(12,16);
    System.out.println("Area of Rectangle : " + r1.getArea());
    System.out.println("Perimeter of Rectangle : " + r1.getPerimeter());
  }
}
