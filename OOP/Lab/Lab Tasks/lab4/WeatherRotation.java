import java.util.Scanner;
public class WeatherRotation{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int arrSize = input.nextInt();
        int[] weekTemperature = new int[arrSize];
        int[] rotatedArray = new int[arrSize];
        for(int i = 0 ; i < arrSize ; i++){
            System.out.print("Please input temperature: ");
            weekTemperature[i] = input.nextInt();
            rotatedArray[i] = weekTemperature[i];
        }
        System.out.print("Input the rotation count: ");
        int rotCount = input.nextInt();
        System.out.print("Enter the threshold temperature: ");
        int threshold = input.nextInt();
        int leap = rotCount + 1;
        for(int i = 0 ; i < arrSize - leap; i++){
            int currTemp = rotatedArray[i];
            if(currTemp > threshold){
                if(rotatedArray[i+leap] > threshold){
                int temp = rotatedArray[i];
                rotatedArray[i] = rotatedArray[i + leap];
                rotatedArray[i+leap] = temp;
                }

            }
        }
        System.out.print("Original Array: ");
        for(int num: weekTemperature){
            System.out.print(num + " ");
        }
        System.out.print("\nRotated Array: ");
        for(int num: rotatedArray){
            System.out.print(num + " ");
        }
    }
}