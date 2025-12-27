import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Main{
    public static void main(String[] args) {
        int[] numArray = {7,8,9};
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(10.7);
        doubleList.add(11.7);
        doubleList.add(12.6);
        ArrayList<Number> numList = new ArrayList<>();
        numList.add(5);
        numList.add(6);
        numList.addAll(doubleList);
        

        Integer[] intArray = {1,23,45};
        List<Integer> intList = Arrays.asList(intArray);
        numList.addAll(intList);
        System.out.println(numList);
      
        numList.remove(0);
        Integer x = 6;
        numList.remove(x);
        System.out.println("After removing some elements");
        System.out.println(numList);

        //adding elements from array
        Integer[] intArray2 = {100,200,300};
        Collections.addAll(numList, intArray2);
        System.out.println(numList);

        //Converting arraylist to array
        Number[] convertedArray = new Number[numList.size()];
        numList.toArray(convertedArray);
        for(Number n : convertedArray){
            System.out.print(n + " ");
        }
    

    }
    
   
}