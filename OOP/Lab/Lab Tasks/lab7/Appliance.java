public class Appliance{
    protected  boolean isOperational = true;
    public Appliance(){};
    public void turnOn(){
        System.out.println("Appliance is turned on.");
    }
    public void turnOff(){
        System.out.println("Appliance is turned off.");
    }
    public void setOperational(boolean isOperational){
        this.isOperational = isOperational;
    }
    public static void main(String[] args){
        Fan f1 = new Fan(false, false);
        f1.turnOn();
        f1.turnOff();

        Light l1 = new Light(false,75);
        l1.turnOn();
        l1.turnOff();

        Fan f2= new Fan(true, true);
        f2.turnOn();
        f2.turnOff();
        
        Light l2 = new Light(true, 0);
        l2.turnOn();
        l2.turnOff();
    }
}
