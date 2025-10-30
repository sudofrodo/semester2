public class Animal{
    private String name;

    public Animal(String name){
        this.name = name;
    }
    public void speak(){
        System.out.println("This is a generic animal.");
    }
    public String getName(){
        return name;
    }
}