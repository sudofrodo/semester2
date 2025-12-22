public class Main{
    public static void main(String[] args) {
        Horse h1 = new Horse(12, "white");
        Horse h2 = new Horse(10, "black");
        System.out.println(h1.getNo());
        System.out.println(Horse.getNo());
        h1.walkAStep();
        h1.walkAStep();
        System.out.println(h1.getStepsWalked());
        //System.out.println(h1.getNum());
        //static methods can be called from objects as well as the class
    }
}