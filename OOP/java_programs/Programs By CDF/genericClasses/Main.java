public class Main{
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(5);
        System.out.println(integerBox.get());
       // integerBox.check("athar"); this will create an error as string is not a number.
       integerBox.check(4.56F);

    }
}