public class Light extends Appliance{
    private boolean isDaytime;
    private int powerLevel;
    public Light(boolean  isDaytime, int powerLevel){
        this.isDaytime = isDaytime;
        this.powerLevel = powerLevel;
        if(powerLevel <= 0){
            isOperational = false;
        }
    }
    @Override
    public void turnOn(){
        if(isOperational && !isDaytime){
            System.out.println("Light is turned on at " + powerLevel + "% brightness.");
        } else if(isOperational && isDaytime){
            System.out.println("Light cannnot be turned on during the day.");
        } else {
            System.out.println("Light is broken and cannot be turned on.");
        }
    }
    @Override
    public void turnOff(){
        System.out.println("Light is turned off.");
    }
}