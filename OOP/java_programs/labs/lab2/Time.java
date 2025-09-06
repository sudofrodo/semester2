public class Time{
  private int hours, mins , secs;
  public Time() {
    hours = mins = secs = 0;
  }
  public Time(int hr , int min , int sec) {
    if (hr > 24 || min > 59 || sec > 59) {
      System.out.println("Invalid time");
      return; 
    }
    hours = hr; mins = min ; sec = secs; 
  }
  public void displayTime() {
    System.out.println("Time is " + hours + ":" + mins + ":" + secs);
  }
  public static void main(String args[]) {
    Time t = new Time(12,30,40);
    t.displayTime();
    Time t2 = new Time(25,34,70);

    
  }
}
