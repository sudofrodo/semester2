public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.9f;

    public MovablePoint(float x, float y , float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed,float ySpeed){
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){
        super();
    }

    public float getXSpeed(){
        return xSpeed;
    }
    public float getYSpeed(){
        return ySpeed;
    }
    public float[] getSpeed(){
       float[] result = new float[2];
       result[0] = xSpeed;
       result[1] = ySpeed;
       return result; 
    }

    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    public void setYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint move(){
        super.setX(getX() + xSpeed);
        super.setY(getY() + ySpeed);
        return this;
    }

    public static void main(String[] args){
        MovablePoint p1 = new MovablePoint(1.0f,1.0f,0.5f,0.5f);
        System.out.println(p1);
        p1.move();
        System.out.println(p1);

    }


}