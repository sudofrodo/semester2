public class Main{
    public static void main(String[] args) {
        Integer num = 20;
        Boolean bool = true;
        Character ch = 'a';
        String str = "athar";
        Float decimal = 4.5556F;
        Double dbl = 5.00;
        Number numb = 4.55f;
        
        int X = Integer.parseInt("3000");
        System.out.println(X);


        System.out.println(numb);

        int number = num.intValue();
        int number2 = 20;
        Integer hundred = 100;
        String hund = hundred.toString();
        System.out.println(hund instanceof String);
        System.out.println(num == number);
        System.out.println(number2 == num);
        System.out.println(num + " " + number);
    }
}