public class Throw{
    public static void main(String[] args) throws Exception{
        int age = 10;
        if(age < 18){
            throw new Exception("age should not be less than 18.");
        }
    }
}