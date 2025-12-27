//marker intefaces.
/*
Cloneable interface is used to make copies of the object, the function to override here is 
"clone" which returns an object , (it is necessary to case the object returned by this function to the actual class)
 , it makes a shallow copy

Comparable interaface is used when objects of the class are being sorted, it makes the defualt order 
the function to overide here is "compareTo" , which return an integer , 1 when this is greater than other 
, -1 when other is greater than this , 0 when both are equal.

Comparator interface is used to compare two objects of class, in custom sorting , the function to override here is "compare" function, 
whose working is similar to comparable , but it is implemented sepreately
*/
public class House implements Cloneable, Comparable<House>{
    int id;
    double area;
    java.util.Date whenBuilt;
    public House(int id , double area){
        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }

    public Object Clone(){
        House houseClone = new House(id,area);
        houseClone.whenBuilt = new java.util.Date();
        return houseClone;
    }
    @Override
    public int compareTo(House o){
        if(area > o.area){
            return 1;
        } else if(area < o.area){
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        House house1 = new House(1, 1750.50);
        House house2 = (House)house1.clone();

    }
    }
