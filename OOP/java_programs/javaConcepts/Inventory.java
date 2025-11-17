import java.util.Scanner;
import java.util.Arrays;
public class Inventory{
    
    public static int[] merger(int[]arr1, int[]arr2){
        int mergedArraySize = arr1.length + arr2.length;
        int[] mergedArray = new int[mergedArraySize];
        for(int i = 0 ; i < arr1.length;i++){ 
                mergedArray[i] = arr1[i];
        }
        int nextIdx = arr1.length; //the next element in merged array would start from index equal to size of first merged array.
        int arr2Idx = 0;
        for(int i = nextIdx ; i < mergedArraySize ;i++){ 
            mergedArray[i] = arr2[arr2Idx]; 
            arr2Idx++;
        }
        return mergedArray;
    }

    public static int[] removeDuplicatesWithin(int[]arr){
        int duplicateCounter = 0;
        int[] checkArr = new int[arr.length];
        for(int i = 0 ; i < arr.length; i++){
            int key = arr[i];
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(key == arr[j]){
                    count++; 
                }
            }
            if(count > 1){
                checkArr[i] = 1;
                duplicateCounter++;
            }
        }
  
        int[] cleanedArr = new int[arr.length - duplicateCounter];
        int idx = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int currNum = arr[i];
            if(checkArr[i] == 0){
                cleanedArr[idx] = currNum; 
                idx++;
            }
        }
        return cleanedArr;
    }


    public static void printArray(int[]arr){
        String arrString = "[ ";
        for(int num: arr){
            arrString += num + " ";
        }
        arrString += " ]";
        System.out.println(arrString);
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of array 1: ");
        int arr1Size = input.nextInt();
        int[] arr1 = new int[arr1Size];
        for(int i = 0 ; i < arr1Size ; i++){
            System.out.print("Enter array Element: ");
            arr1[i] = input.nextInt();
        }

        System.out.print("\nEnter the size of array 2: ");
        int arr2Size = input.nextInt();
        int[] arr2 = new int[arr2Size];
        for(int j = 0 ; j < arr2Size; j++){
            System.out.print("Enter array Element: ");
            arr2[j] = input.nextInt();
        }

        int[] mergedArray = merger(arr1,arr2);      
        Arrays.sort(mergedArray);
        int[] cleanedMergedArray = removeDuplicatesWithin(mergedArray); 
        System.out.println("\nMerged and Sorted Array: ");
        printArray(cleanedMergedArray);
    }
}