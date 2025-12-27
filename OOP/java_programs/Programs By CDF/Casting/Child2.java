public class Child2 extends Parent{
    private int z;
    private String name;
    public Child2(int x, int z, String name){
        super(x,name);
        this.z = z;
    }
    public Child2(){};
    
    public int getZ(){
        System.out.println("Child specific method");
        return z;
    }
}