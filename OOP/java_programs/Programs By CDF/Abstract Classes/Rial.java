public class Rial extends Currency{
    private int valueIdx;
    public Rial(){
        super("Rial" , false);
        valueIdx = 10;
    }

    @Override
    public int exchange(Currency c2) throws Exception{
        if(this.getClass() == c2.getClass()){
            throw new Exception("Same currencies can not be exchanged.");
        }
        return 10;   
    }
}