public class Shape{
    private String name;
    public Shape(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Shape: " + name);
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args){
        Circle c = new Circle("Circle");
        c.display();
        c.calculateArea();

        Rectangle r = new Rectangle("Rectangle");
        r.display();
        r.calculateArea();

        Circle t = new Circle("Triangle");
        t.display();
        t.calculateArea();
    }
}