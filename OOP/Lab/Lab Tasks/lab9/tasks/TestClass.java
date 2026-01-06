public class TestClass{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,20);
        System.out.println("Rectangle Area: " + r.area());
        Triangle t = new Triangle(10,20,30);
        System.out.println("Triangle Area: " + t.area());
        Circle c = new Circle(4.5);
        System.out.println("Circle Area: " + c.area());

        Shape[] shapeArray = {r,t,c};
        double[] areas = CalculateAreas.areaArray(shapeArray);
        System.out.println("All areas: [ " + areas[0] + ", " + areas[1] + ", " + areas[2] + " ]");
    }
}