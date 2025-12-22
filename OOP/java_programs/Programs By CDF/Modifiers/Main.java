public class Main{
    public static void main(String[] args) {
        Scroll s1 = new Scroll("nari", 12, 'c');
        System.out.println("Number of pages: " + s1.pages);
        System.out.println("Type : " + s1.getType());
        System.out.println("Name: " + s1.name);
        s1.close = false;
        System.out.println(s1.close);

        Mail mail = new Mail("qasiba", "hamil", 10, 'a');
        System.out.println(mail.close);
    }
    
}