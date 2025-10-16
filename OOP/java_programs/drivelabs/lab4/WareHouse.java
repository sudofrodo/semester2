import java.util.Scanner;
import java.util.Arrays;

public class WareHouse{
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
        
        int[] checkArr1 = new int[arr1Size];
        int[] checkArr2 = new int[arr2Size];
        int duplicateCounter = 0;
        //checking duplicate elmement indexes in array1;
        for(int i = 0 ; i < arr1Size; i++){
            int key = arr1[i]; //match current element of this array with all elements of second array
            for(int j = 0; j < arr2Size; j++){
                if(key == arr2[j]){
                    duplicateCounter++; //will help determining the size of cleaned array.
                    checkArr1[i] = 1; //if this is duplicate, corressponding index check array value will be 1 , denoting duplicate element 
                }
            }
        }
        //checking duplicate element indexes in array2;
        for(int i = 0; i < arr2Size; i++){
            int key = arr2[i];
            for(int j = 0; j < arr1Size; j++){
                if(key == arr1[j]){
                    checkArr2[i] = 1;
                }
            }
        }
        
        //arrays without duplicate elements;
        int[] cleanedArr1 = new int[arr1.length - duplicateCounter];
        int[] cleanedArr2 = new int[arr2.length - duplicateCounter];
        //cleaning first array
        int idx = 0;
        for(int i = 0 ; i < arr1Size ; i++){
            int currNum = arr1[i];
            if(checkArr1[i] == 0){ //if for corresponding index , value in check array is zero , it means the element is not duplicate , hence should be copied.
                cleanedArr1[idx] = currNum;
                idx++;
            }
        }
        //cleaning second array
        idx = 0;
        for(int i = 0 ; i < arr2Size ; i++){
            int currNum = arr2[i];
            if(checkArr2[i] == 0){
                cleanedArr2[idx] = currNum; 
                idx++;
            }
        }
        
       // merging the arrays;
        int mergedArraySize = cleanedArr1.length + cleanedArr2.length;
        int[] mergedArray = new int[mergedArraySize];
        for(int i = 0 ; i < cleanedArr1.length;i++){ 
                mergedArray[i] = cleanedArr1[i];
        }
        int nextIdx = cleanedArr1.length; //the next element in merged array would start from index equal to size of first merged array.
        int cleanIdx = 0;
        for(int i = nextIdx ; i < mergedArraySize;i++){ 
            mergedArray[i] = cleanedArr2[cleanIdx]; 
            cleanIdx++;
        }
        //sorting the array;
        Arrays.sort(mergedArray);
        
        System.out.println("\nMerged and Sorted Array: ");
        System.out.print("[ ");
        for(int num: mergedArray){
            System.out.print(num + " ");
        }
        System.out.print(" ]");
    }
}