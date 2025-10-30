public class Apple extends Fruits{
    private String condition;
   // public Apple(){};

    public Apple(String condition, String name, double price, int quantity) {
        super(name, price, quantity);
        this.condition = condition;
    }
    //@Override
    // public String toString(){
    //     return "this is an apple instanc";
    // }
    @Override
    public void extra(){
        System.out.println("this is an extra function , only in apple class");
    }

    public void ChildSpecific(){
        System.out.println("this is chidl specific fuct");
    }

public static void main(String[] args){
    // Fruits f1 = new Fruits("kela" , 800, 544);
    // System.out.println(f1.toString());

    Apple a1 = new Apple("rotten" , "redapple" , 200 , 675);
    System.out.println(a1.toString());
    //a1.ParentExtra();

    Fruits f2 = new Apple("kill" , "big aggpe" , 300 , 7887);
    System.out.println(f2.toString());
//     f2.ChildSpecific();
//    f2.extra();

   //new Fruits("nend" , 500 , 600);
    Fruits f3 = new Apple("excellent" , "appleofmyeye", 400, 4554);
    Apple a4 = (Apple) f3;
    a4.extra();
   a4.ParentExtra();
   a4.ChildSpecific();
 //  Apple a2 = new Fruits();







    // String[] test = new String[2];
    //     test[0] = "here";
    //     test[1] = "there";
    // Fruits.main(test);
    }
    // static {
    //     String[] test = new String[2];
    //     test[0] = "here";
    //     test[1] = "there";
    //     Fruits.main(test);
    // }
}