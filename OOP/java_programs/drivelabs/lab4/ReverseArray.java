import java.util.Scanner;
public class ReverseArray{
  public static void main(String args[]) {
  int arrSize;
  Scanner input = new Scanner(System.in);
  System.out.print("Please input array size : ");
  arrSize = input.nextInt();
  int[] chpArray = new int[arrSize];
  int[] modifiedOddArray = new int[arrSize];
  int[] modifiedEvenArray = new int[arrSize];
  for(int i = 0 ; i < arrSize ; i++) {
      System.out.print("Please input array element: ");
      chpArray[i] = input.nextInt();
  }
  if (arrSize % 2 == 0) {
    for (int j = 0 ; j <= arrSize - 1;){
      for (int i = arrSize - 1 ; i >= 0; --i){
      modifiedEvenArray[j] = chpArray[i];
      j++;
    }
  }
  for (int num: modifiedEvenArray){
      System.out.print(num + " ");
  }
  }
  if (arrSize % 2 != 0){
    int firstOddIndex = 1;
    int lastOddIndex = arrSize - 2;
    for (int i = 0 ; i <= arrSize - 1 ; i++){
    if(i % 2 != 0){
    modifiedOddArray[firstOddIndex] = chpArray[lastOddIndex];
    firstOddIndex += 2;
    lastOddIndex -= 2;
    }
    if(i % 2 == 0){
      modifiedOddArray[i] = chpArray[i];
    }
  }
  for (int num : modifiedOddArray){
    System.out.print(num + " ");
  }
  }
  
  }
  
}
  






