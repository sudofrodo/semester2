public class Circle implements Shape{
    double radius;
    public Circle(double r){
        radius = r;
    }
    @Override
    public double area(){
        double area = Math.PI* (radius * radius);
        return area;
    }
}