public class Parent{
    private int x;
    private String name;
    public Parent(){};
    public Parent(int x, String name){
        this.x = x;
    }

    public int getX(){
        System.out.println("Parent method");
        return x;
    }

       public void checkEligibility(Parent p){
        if(p.getX() > 0){
            System.out.println("Eligible");
        }
    }

    public String getName() {
        return name;
    }

    public void process(Parent p){
        //this is for safe downcasting , checking if actual object in memory is of child. by instanceof
        if(p instanceof child){
            Child c = (Child) p;
            System.out.println("Safely Downcasted.");
        } else {
            System.out.println("The object is not of type Child.");
        }
    }

    public static void show(){
        System.out.println("I am Parent.");
    }
}