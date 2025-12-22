

public class Scroll{
    protected String name;//visible in same package and subclasses
    public int pages;
    private double price;
    private char type;
    boolean close; //default modifier , public in same package
    public Scroll(String name , int pages, char type){
        this.name = name;
        this.pages = pages;
        this.type = type;
    }
    public char getType(){
        return type;
    }
    
}

class Mail extends Scroll{
    private String sender;
    public Mail(String sender, String name , int pages , char type){
        this.sender = sender;
        super(name, pages, type);
        super.close = true; 
        //super.price = 12.0; //this will create an error. 
    }

}