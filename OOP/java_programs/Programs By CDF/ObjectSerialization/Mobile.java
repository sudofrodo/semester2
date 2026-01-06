import java.io.Serializable;

public class Mobile implements Serializable{
    private String company;
    private int releaseYear;
    public transient int id; //does not serialize , default reinilization at deserialization.
    public static int price; //does not serialize , checks the value in class at the time.

    public Mobile(String company, int releaseYear, int id, int price){
        this.company = company;
        this.releaseYear = releaseYear;
        this.id = 0;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
    public String getCompany(){
        return company;
    }

    public int getReleaseYear(){
        return releaseYear;
    }

    public int getId(){
        return id;
    }
}