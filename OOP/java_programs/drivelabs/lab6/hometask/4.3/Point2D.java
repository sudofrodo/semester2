public class Point2D{
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(){};
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }
    
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
       float[] result = new float[2];
       result[0] = x;
       result[1] = y;
       return result; 
    }

    @Override
    public String toString(){
        String msg = "(" + x + "," + y + ")";
        return msg;
    }

    // public static void main(String[] args){
    //     Point2D point = new Point2D(1.0f,4.0f);
    //     System.out.println(point);
    //     float[] points = point.getXY();
    //     System.out.println(points[0] + ", " + points[1]);
    // }
}