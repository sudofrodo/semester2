public class Main{
    public static void main(String[] args) {
        Path p1 = new Path(120f, "halkamRoute");
        Path p2 = new Path(70f, "jaisarkum" , true);
        System.out.println(p1.getLength());
    }
}