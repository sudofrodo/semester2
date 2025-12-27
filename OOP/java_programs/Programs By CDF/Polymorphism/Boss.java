public class Boss{
    private String name;
    private int xp;

    public Boss(String name , int xp){
        this.name = name;
        this.xp = xp;
    }

    public void Info(){
        System.out.println("Wrath , the destruction of yours! , I am " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void increaseXp(int n){
        xp += n;
        System.out.println("xp increased now " + xp );
    }
// this will be decided at compile time based on the argument list that which function to call.
    public void increaseXp(){
        xp++;
        System.out.println("xp increased now " + xp);
            
    }
//overriding this will get us an error.
    public final void mergePowers(Boss b){
        System.out.println("Powers merged.");
    }

}