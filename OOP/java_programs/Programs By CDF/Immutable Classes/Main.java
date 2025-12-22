public class Main{
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        Promise p1 = new Promise(date, 3, "misaq");
        System.out.println(p1.getDate() == date);
        Student s1 = new Student(12, "athar");
        System.out.println(s1.name());
    }
}