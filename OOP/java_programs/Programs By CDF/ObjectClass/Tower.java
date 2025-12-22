public class Tower{
    private int levels;
    private String name;
    public Tower(int levels, String name){
        this.levels = levels;
        this.name = name;
    }

    @Override
    public String toString(){ //this is one of Objects class method;
        String msg = "This is " + name + " tower. It has " + levels + " levels.";
        return msg;
    }

    @Override
    public boolean equals(Object obj){
        Tower t = (Tower) obj;
        return (this.name.equals(t.name) && this.levels == t.levels);   
    }
}