public class Well{
    private boolean water;
    private boolean pulley;
    private String name;
    public Well(String name, boolean water, boolean pulley){
        this.name = name;
        this.water = water;
        this.pulley = pulley;
    }
    public void printName(){
        System.out.println(name);
    }
    public void setWater(boolean water){
        this.water = water;
    }
    public boolean getWater(){
        return water;
    }
}