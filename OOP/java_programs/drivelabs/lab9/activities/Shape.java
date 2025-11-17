public class Shape implements EnhancedShape{
    private int area;
    private double xcoord;
    public Shape(double xcoord){
        this.xcoord = xcoord;
    }
    @Override
    public void getPerimeter(){
        System.out.println("this is implemented perimeter");
    }
    public static void main(String[] args) {
        Shape s1 = new Shape(343.4);
        s1.getPerimeter();
    }
}