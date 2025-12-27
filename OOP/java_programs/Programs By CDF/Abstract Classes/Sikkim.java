public class Sikkim extends Currency{
    private int valueIdx;
    public Sikkim(){
        super("Sikkim" , false);
        valueIdx = 1;
    }

    @Override
    public int exchange(Currency c2) throws Exception{
        if(this.getClass() == c2.getClass()){
            throw new Exception("Same currencies can not be exchanged.");
        }
        return 1;   
    }
}