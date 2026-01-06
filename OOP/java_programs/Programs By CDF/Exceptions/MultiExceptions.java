public class MultiExceptions{
    public static void main(String[] args){
        try{
        int[] arr = new int[3];
       // arr[5] = 10;
        String s = null;
        System.out.println(s.length());
        } catch(ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println("An array or null reference error occured");
            System.err.println("--" + e.getMessage());
        } finally{
            System.out.println("Finally");
        }
    }
}
//program is exited at the first exception
//finally executes exception occurs or not
