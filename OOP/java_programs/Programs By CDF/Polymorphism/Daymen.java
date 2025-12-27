public class Daymen extends Boss{
    private String ability;
    public Daymen(String name , int xp , String ability){
        super(name, xp);
        this.ability = ability;
    }
    @Override
    public void Info(){
        System.out.println("Day , Light , Sun , " + super.getName() + " Am  I!");
    }

    public void Fight(){
        System.out.println("Fights");
    }

    

}