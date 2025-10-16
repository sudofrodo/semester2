class HotdogStand{
  private int standId;
  private int piecesSold;
  HotdogStand() {
    standId = 0;
    piecesSold = 0;
  }
  HotdogStand(int id , int sold) {
    standId = id;
    piecesSold = sold;
  }

  public void justSold(){
    piecesSold += 1;
  }
  public int getSoldNum(){
    return piecesSold;
  }
  public int getId(){
    return standId;
  }

}
public class HotdogStandRunner{
  public static void main(String args[]) {
     HotdogStand stand1 = new HotdogStand(1, 0);
     HotdogStand stand2 = new HotdogStand(2, 0);
     HotdogStand stand3 = new HotdogStand(3,10);
     for (int i = 0; i <= 5; i++) {
       stand1.justSold();
     }
     stand2.justSold();
     System.out.println("Stand 1,  Pieces Sold : " + stand1.getSoldNum());
     System.out.println("Stand 2,  Pieces Sold : " + stand2.getSoldNum());
     System.out.println("Stand 3,  Pieces Sold : " + stand3.getSoldNum());
  }
}
