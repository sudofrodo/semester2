enum Color{
    WHITE, BLUE, GREEN, BROWN;
    public void display(){
        System.out.println("This is color : " + this);
    }
    private Color(){
        System.out.println("Constructor called for this color: " + this);
    }
}
