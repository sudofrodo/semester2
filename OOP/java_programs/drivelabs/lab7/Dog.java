public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void speak(){
        if(super.getName() == "Buddy"){
            System.out.println("Woof Woof");
        } else {
            super.speak();
        }
    }
    public static void main(String[] args) {
        Animal a = new Animal("leto");
        a.speak();
        Dog d = new Dog("Buddy");
        d.speak();
        Dog m = new Dog("Max");
        m.speak();
    }
}