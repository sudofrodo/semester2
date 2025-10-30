public class Engine{
    private char letter;
    private boolean old;
    private int year;
    private String name;

    public Engine(char letter, boolean old, int year, String name){
        this.letter = letter;
        this.old = old;
        this.year = year;
        this.name = name;
    }

    public void startEngine(){
        System.out.println("Ghooooon Ghooooooooooooon");
    }

    public void radiator(String work){
        System.out.println("Working on :" + work);
    }

    public void radiator(String work , int times){
        System.out.println("This worked : " + work  + " times: " + times);
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }


}