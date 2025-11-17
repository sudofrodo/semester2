//[2,1,2,2,2,3,2]
public class GetUniqueElements{
    public static void cleaner(int[]arr){
        int[] checkArr = new int[arr.length];
        for(int i = 0 ; i < arr.length; i++){
            int key = arr[i];
            if(i + 1 == arr.length){
                break;
            } else {
            for(int j = i + 1; j < arr.length; j++){
                if(key == arr[j]){
                    checkArr[j] = 1;
                }
            }
            }
        }
        int uniqueElements = 0;
        for(int num: checkArr){
            if(num == 0){
                uniqueElements++;
            }
        }
        
        int[] cleanedArr = new int[uniqueElements];
        int idx = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int currNum = arr[i];
            if(checkArr[i] == 0){
                cleanedArr[idx] = currNum; 
                idx++;
            }
        }
        System.out.println("Cleaned Array: ");
        for(int num: cleanedArr){
            System.out.print(num + " ");
        }
       
    }
    public static void main(String args[]){
        int[] array = {1,5,3,3,1};
        cleaner(array);
    }
}
