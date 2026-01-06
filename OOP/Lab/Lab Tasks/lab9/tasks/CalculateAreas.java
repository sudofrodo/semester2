public class CalculateAreas{
    public static double[] areaArray(Shape[] shapes){
        double[] areas = new double[shapes.length]; 
        for(int i = 0 ; i < shapes.length; i++){
            areas[i] = shapes[i].area();
        }
        return areas;
    }
}