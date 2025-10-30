public class Fan extends Appliance{
    private boolean isSummer;
    private boolean isBroken;
    public Fan(boolean isSummer, boolean isBroken){
        this.isSummer = isSummer;
        this.isBroken = isBroken;
        if(isBroken){
            isOperational = false;
        }
    }
    @Override
    public void turnOn(){
        if(isSummer && isOperational){
            System.out.println("Fan is turned on.");
        } else if(!isSummer && isOperational){
            System.out.println("Fan cannot be turned on in winter");
        } else {
            System.out.println("Fan is broken and cannot be turned on.");
        }     
    }
    @Override
    public void turnOff(){
        System.out.println("Fan is turned off.");
    }
    
}