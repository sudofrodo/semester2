import java.util.Date;
final public class Promise{
    private final Date date;
    private final int persons;
    private final String name;

    public Promise(Date date, int persons , String name){
        Date tempDate = new Date(date.getTime());
        this.date = tempDate;
        this.persons = persons;
        this.name = name;
    }
    
    //only getters ,no setters
    public Date getDate(){
        return new Date(date.getTime());
    }
}
/*
to make a class immutable
--make class final
--make fields private and final
--new references are made for mutable objects
--no setters , only getters
--mutable objects are returned with new referenece
--all fields are iniliazed by constructor
*/