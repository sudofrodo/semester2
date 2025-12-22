public class Main{
    public static void main(String[] args) {
        Animal a1 = new Animal("safu");
        a1.move();
        a1.attack();
        a1.move();
        //a1.fitInCarriage(); // parent object can not call , child specific method
        Horse h1 = new Horse("safawil", "brown");
        h1.move();
        h1.move(5);
        h1.attack();
        h1.eat(); //if a method is not overrided in child class, parent method is called.
        h1.eat();
        h1.eat();
        System.out.println(h1.getPower());
        h1.jump();
    }
}