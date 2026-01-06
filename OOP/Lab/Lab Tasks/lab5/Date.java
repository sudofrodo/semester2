//Note : Date Value by Default is (1,1,1970)
public class Date{
    private int day;
    private int month;
    private int year;

    public Date(){
        this(1,1,1970);
    }
    public Date(int d){
        this(d,1,1970);
    }
    public Date(int d , int m){
        this(d,m,1970);
    }
    public Date(int d , int m, int y){
       setDate(d,m,y);
    }
    public Date(Date date){
        this(date.getDay() , date.getMonth() , date.getYear());
    }

    public void setDate(int dd, int mm, int yy){
        setDay(dd);
        setMonth(mm);
        setYear(yy);
    }

    public void setDay(int d){
        if(d < 0 || d > 28){
            throw new IllegalArgumentException(
                "Day is not correct."
            );
        } else {
        this.day = d;
        }
    }
    public void setMonth(int m){
        if(m < 1 || m > 12){
            throw new IllegalArgumentException("Month is not correct.");
        } else {
        this.month = m;
        }
    }
    public void setYear(int y){
        if(y < 1970 || y > 2021){
            throw new IllegalArgumentException(
                "Year is not correct."
            );
        } else {
        this.year = y;
        }
    }

    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }

    public String toString(){
    int day = this.day;
    int month = this.month;
    String sYear = String.valueOf(year);
    char[] aYear = sYear.toCharArray();
    String fYear = String.valueOf(aYear[2]) + String.valueOf(aYear[3]);
   
    String dateString = day + "/" + month + "/" + fYear;
    return dateString;
    }
    
}