import java.util.Scanner;
public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){}
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(double side1, double side2, double side3, String color, boolean filled){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getArea() {
    //area by heron's formula.
    double s = getPerimeter() / 2; //semi perimeter
    double area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
    return area;
    }

    @Override
    public double getPerimeter() {
        return (side1 + side2 + side3);
    }
    @Override
    public String toString(){
        String info = "Triangle: \nSide 1: " 
        + side1 + "\nSide 2: "
        + side2 + "\nSide 3: " + side3 
        + super.toString();
        return info;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side 1 length: ");
        int l1 = sc.nextInt();
        System.out.print("Enter Side 2 length: ");
        int l2 = sc.nextInt();
        System.out.print("Enter Side 3 length: ");
        int l3 = sc.nextInt();
        System.out.print("Enter color: ");
        sc.nextLine();
        String color = sc.next();
        System.out.print("Fill (y/n): ");
        boolean fill;
        char choice = sc.next().charAt(0);
        fill = choice == 'y';
        
        Triangle t = new Triangle(l1,l2,l3,color,fill);
        System.out.println(t);
        System.out.printf("%s: %.2f" , "Perimeter",t.getPerimeter());
        System.out.printf("\n%s: %.2f\n" , "Area" , t.getArea());
    }
}