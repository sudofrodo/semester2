abstract class Currency{
    private String name;
    private boolean coin;
    public Currency(String name, boolean coin){
        this.name = name;
        this.coin = coin;
    }
    public abstract int exchange (Currency c2) throws Exception;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCoin() {
        return coin;
    }

    public void setCoin(boolean coin) {
        this.coin = coin;
    }
}