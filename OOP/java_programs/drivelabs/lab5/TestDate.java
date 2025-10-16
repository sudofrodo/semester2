public class TestDate{
    public static void main(String[] args){
    
        Date d1 = new Date(10,12,2010);
       // d1.toString();
        try{
        Date d2 = new Date(33,30,2011);
        } catch(IllegalArgumentException e){
            System.out.println("Exception : " + e.getMessage());
        }
        Date d3 = new Date(11,12,2015);
        System.out.println("Date 1 : " + d1.toString());
        System.out.println("Date 3 : " + d3.toString());
    }
    
}