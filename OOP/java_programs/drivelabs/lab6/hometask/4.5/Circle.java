
public class Circle extends Shape{
    private double radius = 1.0;

    public Circle(){
        super();
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI * (radius * radius);
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public String toString(){
        String msg = "Circle[" + super.toString() + ", radius = " + radius + "]";
        return msg;
    }
    public static void main(String[] args) {
        Circle c = new Circle(3.0, "blue" , true);
        System.out.println(c);
        System.out.println("Perimeter : " + c.getPerimeter());
        System.out.println("Area " + c.getArea());

    }


}