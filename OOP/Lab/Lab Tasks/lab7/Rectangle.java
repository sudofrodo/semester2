public class Rectangle extends Shape{
    public Rectangle(String name){
        super(name);
    }
    public void calculateArea(){
        if(super.getName() != "Rectangle"){
            System.out.println("Invalid Shape");
        } else {
        System.out.println("Area: " + 6*4);
        }
    }
}