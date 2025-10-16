public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){
        super();
    }
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getlength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        double perimeter = 2 * (length + width);
        return perimeter;
    }
    @Override
    public String toString(){
        String msg = "Rectangle[" + super.toString() + ", width = " + width + ", length = " + length + "]";
        return msg; 
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3.0,4.0,"green",false);
        System.out.println(r);
        System.out.println("Perimeter " + r.getPerimeter());
        System.out.println("Area " + r.getArea());

    }

}