import java.util.Comparator;

public class Salat implements Comparable<Salat>{
    String name;
    int farz;
    int sunnah;
    Time time;

    public Salat(String name, int farz,  int sunnah, Time time) {
        this.farz = farz;
        this.name = name;
        this.sunnah = sunnah;
        this.time = time;
    }

    @Override
    public int compareTo(Salat t) {
        if ("AM".equals(this.time.meridiem) && "PM".equals(t.time.meridiem)){
            return -1;
        } 
        if(this.time.meridiem.equals(t.time.meridiem)){
            if (this.time.hour != t.time.hour){
               return this.time.hour - t.time.hour;
            } 
            if (this.time.minute != t.time.minute){
               return this.time.minute - t.time.minute;
            }
            if(this.time.second != t.time.second){
               return this.time.second - t.time.second;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public String toString(){
        String message = name + " has " + farz + " farz" + ", " + sunnah + " sunnah" + " and is held at: " + time.toString();
        return message;
    }
    
}

class sortByFarz implements Comparator<Salat>{
    @Override
    public int compare(Salat s1, Salat s2) {
            if(s1.farz != s2.farz){
            return s1.farz - s2.farz;
            }
            return (s1.name.compareTo(s2.name));
    }
}

class sortBySunnah implements Comparator<Salat>{
    @Override
    public int compare(Salat s1, Salat s2) {
            if(s1.sunnah != s2.sunnah){
            return s1.sunnah - s2.sunnah;
            }
            return (s1.name.compareTo(s2.name));
    }
}

class sortByName implements Comparator<Salat>{
    @Override
    public int compare(Salat s1, Salat s2){
        return (s1.name.compareTo(s2.name));
    }
}


