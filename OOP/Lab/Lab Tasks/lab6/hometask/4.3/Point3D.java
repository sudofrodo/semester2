public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }
    public Point3D(){
        super();
    }

    public float getZ(){
        return z;
    }
    public void setZ(float z){
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] result = new float[3];
        result[0] = getX();
        result[1] = getY();
        result[2] = z;
        return result;
    }

    @Override
    public String toString(){
        String msg = "(" + getX() + "," + getY() + "," + z + ")";
        return msg; 
    }
    
    // public static void main(String[] args){
    //     Point3D point = new Point3D(1.0f,3.0f,4.0f);
    //     System.out.println(point);
    //     Point3D zeroPoint = new Point3D();
    //     System.out.println(zeroPoint); 
    //     zeroPoint.setXYZ(2.0f,4.0f,3.5f);
    //     System.out.println(zeroPoint);
    // }
}