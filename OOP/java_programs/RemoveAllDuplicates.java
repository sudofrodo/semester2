public class RemoveAllDuplicates{
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
}