public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }


    public double getDiameter() {
        return (radius * 2);
    }

    @Override
    public String toString(){
        String info = "Circle: \nRadius: " + radius + super.toString();
        return info;
    }
    @Override
    public double getArea() {
        return (Math.PI * (radius * radius));
    }

    @Override
    public double getPerimeter() {
        return (2 * Math.PI * radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(3.0, "red", false);
        System.out.println(c1);
        System.out.printf("%s: %.2f", "Diameter" ,c1.getDiameter());
        System.out.printf("\n%s: %.2f" , "Perimeter",c1.getPerimeter());
        System.out.printf("\n%s: %.2f\n" , "Area" , c1.getArea());
    }
}