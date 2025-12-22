public class Car{
    private String name;
    private int model;
    private Engine engine;

    public Car(String name, int model){
        this.name = name;
        this.model = model;
        this.engine =  new Engine('a', true, 3401, "kuzoor");
        // engine is a part of car which can't exist independently , engine will be destroyed with the car.
    }

    public void onHeadlights(){
        System.out.println("Headlights are on :");
    }

    public static void main(String[] args) {
        Car c1 = new Car("izmaan" , 3402);
        c1.getEngine().startEngine();
        c1.onHeadlights();
    }

    public Engine getEngine() {
        return engine;
    }
}