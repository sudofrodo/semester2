public class Circle extends Shape{
    
    public Circle(String name){
      super(name);
    }
    public void calculateArea(){
        if(super.getName() != "Circle"){
            System.out.println("Invalid Shape");
        } else {
        System.out.println("Area: " + Math.round(5*5 * Math.PI));
        }
    }

}