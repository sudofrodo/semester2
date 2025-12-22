//Enum declaration can be done outside a class or inside a class but not inside a method.
public class Main {
  enum TrafficLight {
    RED, GREEN, YELLOW;
  }
  public static void main(String[] args) {
      TrafficLight x = TrafficLight.GREEN;
      System.out.println(x);

      Color c = Color.BROWN;
      System.out.println(c);

      //iterating over enums
      for(Color clr : Color.values()){
        System.out.println(clr);
      }

      //enum in switch Statment;
      switch(x){
        case RED:
            System.out.println("Stop");
            break;
        case YELLOW:
            System.out.println("Get Ready to Go!");
            break;
        case GREEN:
            System.out.println("GO!");
            break;
        default:
            System.out.println("System Malfunction , Just GO");
      }


  }
}
