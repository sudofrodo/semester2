public class Sword{
    private final int power; //final cant be changed;
    private boolean historic;
    private String name;
    private String material;

    public Sword(int power, boolean historic , String name , String material){ //4 argument constructor;
        this.power = power;
        this.historic = historic;
        this.name = name;
        this.material = material;
    }
    public Sword(String name , String material){ //2 arguement constructor
        this(1,false,name,material);
    }

    public Sword(String material){ //single arguement constructor;
        this(1,false,"unknown", material);
    }
}