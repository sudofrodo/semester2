public class Triangle implements Shape{
    private double base;
    private double hyp;
    private double perp;
    public Triangle(double b, double h, double p){
        base = b;
        hyp = h;
        perp = p;
    }
    @Override
    public double area(){
        double area = 0.5* (base + perp);//for right angles.
        return area;
    }
}