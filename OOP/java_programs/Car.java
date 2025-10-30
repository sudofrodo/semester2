public class Car{
    private String name;
    private int model;
    private Engine engine;
    private MusicPlayer mp3Player;

    public Car(String name, int model, Engine e, MusicPlayer mp3){
        this.name = name;
        this.model = model;
        this.engine = e;
        this.mp3Player = mp3;
    }

    public void onHeadlights(){
        System.out.println("Headlights are on :");
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine('a', true, 3401, "kuzoor");
        //myEngine.startEngine();
        MusicPlayer myMusic = new MusicPlayer();
        Car c1 = new Car("izmaan" , 3402, myEngine, myMusic );
        c1.getEngine().startEngine();
        c1.getMp3Player().playMusic();
        c1.onHeadlights();
    }

    public Engine getEngine() {
        return engine;
    }

    public MusicPlayer getMp3Player() {
        return mp3Player;
    }
}