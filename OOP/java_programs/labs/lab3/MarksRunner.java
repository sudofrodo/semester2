class Marks{
  private int sub1, sub2, sub3;
  Marks(){
    sub1 = sub2 = sub3 = 0;
  }
  Marks(int s1,int s2,int s3) {
    sub1 = s1;
    sub2 = s2;
    sub3 = s3;
  }

  public void setSub1Marks(int m) {
    sub1 = m;
  }
  public void setSub2Marks(int m) {
    sub2 = m;
  }
  public void setSub3Marks(int m) {
    sub3 = m;
  }

  public int getSub1Marks(){
    return sub1;
  }
  public int getSub2Marks(){
    return sub2;
  }
  public int getSub3Marks(){
    return sub3;
  }
}

public class MarksRunner{
  public static void main(String args[]) {
    Marks std = new Marks();
    std.setSub1Marks(10);
    std.setSub2Marks(20);
    std.setSub3Marks(30);

    System.out.println("Subject 1 marks : "+ std.getSub1Marks());
    System.out.println("Subject 2 marks : "+ std.getSub2Marks());
    System.out.println("Subject 3 marks : "+ std.getSub3Marks());
  }
}

