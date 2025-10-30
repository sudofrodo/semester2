public class WaterConnection{
    private String connectionId;
    private double consumedUnits;
    
    public WaterConnection(){};
    public WaterConnection(String id, double units){
        connectionId = id;
        consumedUnits = units;
    }
    
    public void showUsage(){
        System.out.println("Units Consumed: " + consumedUnits);
    }

    public String getConnectionId(){
        return connectionId;
    }
    public double getConsumedUnits(){
        return consumedUnits;
    }

    public void setConnectionId(String id){
        connectionId = id;
    }
    public void setConsumedUnits(double units){
        consumedUnits = units;
    }

}