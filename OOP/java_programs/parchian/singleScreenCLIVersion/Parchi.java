public class Parchi
{
    private String name;
    private int points;
    private boolean starting;

    public Parchi(){};
    public Parchi(String name, int points)
    {
        this.name = name;
        this.points = points;
        starting = false;
    }

    public void setStarting(boolean value)
    {
        starting = value;
    }
    public boolean getStarting()
    {
        return starting;
    }

    public String getParchiName()
    {
        return name;
    }

    public int getParchiPoints()
    {
        return points;
    }

    public void displayParchi()
    {
    	if(starting == true){
        System.out.println(name + " (s)");
        } else {
        System.out.println(name);
        }
        System.out.println("Points: " + points);
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Parchi p = (Parchi) obj;
        return (this.name.equals(p.name)) && (this.points == p.points);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + points;
        return result;
    }
}
