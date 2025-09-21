public class CylinderRunner{
  public static void main(String[] args) {
    Cylinder c1 = new Cylinder();
    Cylinder c2 = new Cylinder(10);
    Cylinder c3 = new Cylinder(15, 3.14);

    c3.computeArea();
    c3.computeVolume();
    c3.displayInfo();
  }
}
