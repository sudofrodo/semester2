public class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setLength(side);       
    }
    @Override
    public void setLength(double side){
        super.setLength(side);
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    
    @Override
    public String toString(){
    String msg = "Square[" + super.toString() + "]";
    return msg;
    }
    public static void main(String[] args) {
        Square s = new Square(10.5,"yellow",true);
        System.out.println(s);
        System.out.println("Area " + s.getArea());
        System.out.println("Perimeter" + s.getPerimeter());
    }
}