public class Character{
    private int age;
    private String name;
    private double xp;

    public Character(int age , String name , double xp){
        this.name = name;
        this.age = age;
        this.xp = xp;
    }

    //copy constructor
    public Character(Character charc){
        name = charc.getName();
        age = charc.getAge();
        xp = charc.getXp();
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public double getXp(){
        return xp;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }
    
    public Character shallowCopy(){
        return this; 
    }

    public Character deepCopy(){
        return new Character(this);
    }
}