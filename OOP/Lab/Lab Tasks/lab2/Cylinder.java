public class Cylinder{
  private double radius;
  private double height;
  public  Cylinder() {};
  public Cylinder(double height){
  radius  = 1;
  this.height = height;
  }
  public Cylinder(double height , double radius){
  this.radius = radius;
  this.height = height;  
  }
  public void setRadius(double r){
  radius = r;
}
  public void setHeight(double h){
  height = h;
  }
  
  public double getRadius(){
    return radius;
  }

  public double getHeight(){
    return height;
  }
  
  public double computeArea(){
    return (2 * 3.14 * radius * height) + (2 * 3.14 * radius * radius);
  }
  public double computeVolume(){
    return (3.14 * radius * radius * height);
  }
  public void displayInfo() {
    System.out.println("Cylinder height : " + height);
    System.out.println("Cylinder radius : " + radius);
    System.out.println("Area : " + computeArea());
    System.out.println("Volume : " + computeVolume());
  }

}
