
import java.util.ArrayList;
import java.util.Collections;

public class DriverClass {
  public static void printList(ArrayList<Salat> salatList){
           for(Salat s : salatList){
            System.out.println(s);
        }
  }
  public static void main(String[] args) {
        Time fajarTime = new Time(6,0,0,"AM");
        Salat fajar = new Salat("Fajar",2,2,fajarTime);
        Time zuhurTime = new Time(1,30,0,"PM");
        Salat zuhur = new Salat("Zuhur",4,6,zuhurTime);
        Time asarTime = new Time(4,0,0,"PM");
        Salat asar = new Salat("Asar",4,4,asarTime);
        Time maghribTime = new Time(5, 12, 0, "PM");
        Salat maghrib = new Salat("Maghrib",3,2,maghribTime);
        Time ishaTime = new Time(7,0,0,"PM");
        Salat isha = new Salat("Isha",4,6,ishaTime);

        ArrayList<Salat> salatList = new ArrayList<>();

        salatList.add(maghrib);
        salatList.add(fajar);
        salatList.add(zuhur);
        salatList.add(isha);
        salatList.add(asar);

        System.out.println("Unordered: ");
        printList(salatList);
        //default Ordering
        System.out.println("\nOrdered by Time: ");
        Collections.sort(salatList);
        printList(salatList);

        System.out.println("\nOrdered by Name: ");
        Collections.sort(salatList, new sortByName());
        printList(salatList);

        System.out.println("\nOrdered by Farz: ");
        Collections.sort(salatList, new sortByFarz());
        printList(salatList);

        System.out.println("\nOrdered by Sunnah");
        Collections.sort(salatList, new sortBySunnah());
        printList(salatList);
 
   
  }
}