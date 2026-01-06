public class Car extends Vehicle{
    private String brand;
    public Car(String brand , int speed){
        super(speed);
        if(speed > 0){
            this.brand = brand;
        } else {
            this.brand = "Unknown";
        }
    }
    public void displayBrand(){
        System.out.println("Brand: " + brand);
            
    }

    public static void main(String[] args){
        Car c1 = new Car("Honda" , 0);
        c1.displaySpeed();
        c1.displayBrand();

        Car c2 = new Car("Kia" , 250);
        c2.displaySpeed();
        c2.displayBrand();
    } 
}
