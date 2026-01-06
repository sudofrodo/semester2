public class GenericMethod{
    public static void main(String[] args){
        Integer[] intArray = {1,2,3,4};
        Character[] charArray = {'a','b','c'};
        String[] stringArray = {"athar", "abbas"};
        printArray(intArray);
        printArray(charArray);
        printArray(stringArray); 
    }
    public static <T> void printArray(T[] inputArray){
        for(T element : inputArray){
            System.out.println(element);
        }
    }

}