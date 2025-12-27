public class Main{
    public static void main(String[] args){
        Rial r = new Rial();
        Sikkim s = new Sikkim();
        try{
        System.out.println(r.exchange(s));
        System.out.println(s.exchange(r));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}