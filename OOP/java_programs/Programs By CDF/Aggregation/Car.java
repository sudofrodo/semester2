public class Car{
    private String name;
    private int model;
    private MusicPlayer mp3Player;

    public Car(String name, int model, MusicPlayer mp3){
        this.name = name;
        this.model = model;
        this.mp3Player = mp3;
    }    

    public void onHeadlights(){
        System.out.println("Headlights are on :");
        }

    public static void main(String[] args) {
        MusicPlayer myMusic = new MusicPlayer(); //this is an example of aggregation: where music player can exist indepently
        //of the car , the Object is created seperately from the car , car can be destroyed but the music player remains.
        Car c1 = new Car("izmaan" , 3402, myMusic );
        c1.getMp3Player().playMusic();
        c1.onHeadlights();
    }


    public MusicPlayer getMp3Player() {
        return mp3Player;
            }
}