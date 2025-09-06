public class Distance{
  public int feet;
  public double inches;
  public Distance() {
    feet = 0;
    inches = 0;
  };
  public Distance(int foots, double inchs) {
      feet = foots;
      inches = inchs;
  }
  public void displayDistance() {
    System.out.println("Distance  : " + feet + " feet " + inches + " inches");
  }
  public static void main(String args[]) {
    Distance d1 = new Distance(4,4);
    d1.displayDistance();
  }
}
