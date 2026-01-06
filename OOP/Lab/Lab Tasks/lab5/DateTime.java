//import utility.Date;
public class DateTime{
    private Date date;
    private Time time; 
    public DateTime(){
        this.date = new Date(1,1,1970);
        this.time = new Time(0,0,0);
    }
    public DateTime(Date date){
        this.date = date;
        this.time = new Time(0,0,0);
    }
    public DateTime(Time time){
        this.time = time;
        this.date = new Date(1,1,1970);
    }
    public DateTime(Date date , Time time){
        this.date = new Date(date);
        this.time = new Time(time);
    }
    public DateTime(DateTime dateTime){
        date = dateTime.getDate();
        time = dateTime.getTime();

    }
    public DateTime(int day,int mon,int year,int hr,int min,int sec){
        date = new Date(day,mon,year);
        time = new Time(hr,min,sec);
    }

    public void setDateTime(int day,int mon,int year,int hr,int min,int sec){
        date = new Date(day,mon,year);
        time = new Time(hr,min,sec);
    }

    public void setDate(int day, int mon, int year){
        date.setDay(day);
        date.setMonth(mon);
        date.setYear(year);
    }

    public void setTime(int hr, int mins, int sec){
        time.setHour(hr);
        time.setMinute(mins);
        time.setSecond(sec);
    }

    public Date getDate(){
        return date;
    }
    public Time getTime(){
        return time;
    }

    public String toString(){
        String dateNTime = "Time : " + time.toString() + "\nDate: " + date.toString();
        return dateNTime;
    }

    // public static void main(String[] args){
    //     Date d1 = new Date(10,12,2010);
    //     Time t1 = new Time(12,13,14);
    //     DateTime dt1 = new DateTime(d1,t1);
    //     System.out.println(dt1.toString());
    // }

}