public class DateTimeTest{
    public static void main(String[] args){
        try
        {
        Date d1 = new Date(10,12,2005);
        Time t1 = new Time(12,13,14);
        //constructor with both date and time.
        DateTime dt1 = new DateTime(d1,t1);
       

        Date d2 = new Date(10,11,2011);
        //constructor with date only;
        DateTime dt2 = new DateTime(d2);
        dt2.setTime(11,12,13);
       

        Time t3 = new Time(1,45,54);
        //constructor with time only
        DateTime dt3 = new DateTime(t3);
        dt3.setDate(28,10,2011);
        

       // default constructor
        DateTime dt4 = new DateTime();
        dt4.setTime(7,55,44);
        dt4.setDate(8,9,2014);
        

        //constructor with 6 arguements
        DateTime dt5 = new DateTime(8,12,2016,13,19,39);
      

        //copy constructor
        DateTime dt6 = new DateTime(dt5);
       
        //array of objects
        DateTime[] dateTimeArray = {dt1,dt2,dt3,dt4,dt5,dt6};
        int i = 1;
        for(DateTime dt : dateTimeArray){
            System.out.println("DateTime " + i + "\n" + dt.toString());
            i++;
        }

        //invalid values
        System.out.print("D7 : ");
        DateTime dt7 = new DateTime(32,12,2019,12,12,12);


        } 
        catch(IllegalArgumentException e)
        {
            String exceptionMessage = e.getMessage();
            StackTraceElement[] elements = e.getStackTrace();
            int lineNo = elements[0].getLineNumber();
            String fileName = elements[0].getFileName();
            System.out.println("Exception : " + exceptionMessage + "( line no: " + lineNo + ", File: " + fileName + " )");
        }
    }
}