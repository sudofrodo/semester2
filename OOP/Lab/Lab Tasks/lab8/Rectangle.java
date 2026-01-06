public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {}

    public Rectangle(double height, double width) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double height, double width, String color, boolean filled) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (2 * (width + height));
    }

    @Override
    public String toString(){
        String info = "Rectangle: \nHeight: " + height + "\nWidth: " + width + super.toString();
        return info;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20, "green", true);
        System.out.println(r1);
        System.out.printf("%s: %.2f" , "Perimeter",r1.getPerimeter());
        System.out.printf("\n%s: %.2f\n" , "Area" , r1.getArea());
    }

}