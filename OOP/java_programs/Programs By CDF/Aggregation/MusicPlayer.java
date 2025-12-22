public class MusicPlayer{
    private String company;
    private double length;
    private float  width;

    public MusicPlayer(String company, double length, float w){
        this.company = company;
        this.length = length;
        width = w;
    }
    public MusicPlayer(double length){
        this.length = length;
    }
    public MusicPlayer(){};

    public void playMusic(){
        System.out.println("Playing: Kinne kinne jana billo de ghar!");
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
}