public class Camel{
    private String name;
    private double xp;

    public Camel(String name , double xp){
        this.name = name;
        this.xp = xp;
    }
    //finalize is used for Garbage Colletion , to perform cleanup 
    //activties , this method is deprecetead now , try-with-resources
    //is used.
    @Override
    public void finalize() throws Throwable{
        try {
            super.finalize();
        } catch (Throwable e) {
            //throw e;
            System.out.println("Error in Collecting Garbage");
        }
    }
}