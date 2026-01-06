public class NestedExceptions{
    public static void main(String[] args){
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            try{
                System.out.println(e.getMessage());
                int[] arr = new int[5];
                arr[6] = 10;
            } catch(ArrayIndexOutOfBoundsException f){
                System.out.println(f.getMessage());
            }
        }
    }
}