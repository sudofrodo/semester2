public class Marks {
  private int sub1;
  private int sub2;
  private int sub3;
  public Marks() {
    sub1 = sub2 = sub3 = 0;
  };
  public Marks(int first , int second , int third) {
  sub1 = first;
  sub2 = second;
  sub3 = third;
  }
  public int sum() {
    return sub1 + sub2 + sub3;
  }
  public static void main(String args[]) {
    Marks s1 = new Marks(10,20,30);
    System.out.println("The sum of marks is " + s1.sum());
  }
}
