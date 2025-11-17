public class Time 
{
   int hour;   // 0 - 12
   int minute; // 0 - 59
   int second; // 0 - 59
   String meridiem; //AM - PM

   public Time( int h, int m, int s, String meri ) 
   {
      hour = h;
      minute = m;
      second = s;
      meridiem = meri;
   } 
   // convert to String in standard-time format (H:MM:SS AM or PM)
   public String toString()
   {
      return String.format( "%d:%02d:%02d %s", 
         hour,minute, second, meridiem);
   }
} 
