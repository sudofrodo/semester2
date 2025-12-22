public class StaticNonStaticBlocks
{
    private int check;
    {
        System.out.println("not static block");
        check = 4;
    }
    {
        System.out.println("Second non static block");
    }
    public StaticNonStaticBlocks(int c)
    {
        check = c;
        System.out.println("inside construtor.");
    }
 //   public StaticNonStaticBlocks(){};
   
    public static void ping()
    {
        System.out.println("class pinged");
    }
    public int getCheckt()
    {
        return check;
    }
    public static void main(String args[])
    {
       System.out.println("inside main");
       StaticNonStaticBlocks s1 = new StaticNonStaticBlocks(5);
       System.out.println("second object");
       StaticNonStaticBlocks s2 = new StaticNonStaticBlocks(6);
       System.out.println(s1.getCheckt());
    }
    static {
        System.out.println("static block");
      //  check++; //will create an error.
    }
    static {
        System.out.println("second static block");
    }

}
/* order of execution
    1-Static blocks in order of lines; (static blocks dont care about instantiaton , tho they care about main)
    2-main function is made , then it will be called , which is actually static (irrespective of instantiation)
    3-if object is made then , non static blocks are executed first , even before constructor. (they are not executed without instantiation)
    4-then comes the constructor.
    5-all though in all frameworks code execute line by line;

    static blocks -> (object is made) non static blocks -> constructor
    //static blocks are executed only once , while non static blocks at every instansitation;
*/
