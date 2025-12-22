public class Path{
    private float length;
    private String name;
    private boolean markings;
    
    public Path(float length, String name){
        this.length = length;
        this.name = name;
    }
    
    public Path(float len, String nam, boolean marks){
        length = len;
        name = nam;
        markings = marks;
    }

    public float getLength(){
        return length;
    }
    public void setLength(float len){
        this.length =  len;
    }
}