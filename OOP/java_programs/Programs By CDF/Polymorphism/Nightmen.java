public class Nightmen extends Boss{
    private String ability;
    private int kills;

    public Nightmen(String name, int xp , String ability, int kills){
        super(name, xp);
        this.ability = ability;
        this.kills = kills;
    }

    @Override
    public void Info(){
        System.out.println("Cold heart, Dark Blood " + super.getName() + " is my name. Many I dissolved in the very air. " + this.kills);
    }

}