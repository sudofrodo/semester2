import java.util.Scanner;
public class SecondHighestScore{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int arrSize;
        System.out.print("Please input array length: ");
        arrSize = input.nextInt();
        int[] scoreArray = new int[arrSize];
        for (int i = 0 ; i <= arrSize - 1 ; i++){
            System.out.print("Please input array Element: ");
            scoreArray[i] = input.nextInt();
        }
        int[] uniqueCheck = new int[arrSize];
        int firstScore = scoreArray[0];
        boolean sameCheck = true;
        for(int i = 1 ; i <= arrSize - 1; i++){
            if(scoreArray[i] != firstScore){
                sameCheck =false;
            } 
        }
        int highestscore = 0;
        int secondHighestScore = 0;
        if(sameCheck){
            System.out.println("Not enough unique scores.");
        } else {
            for(int num: scoreArray){
                if(num > highestscore){
                    highestscore = num;
                }
            }
            for(int num: scoreArray){
                if(num > secondHighestScore && num != highestscore) {
                    secondHighestScore = num;
                }
            }
            System.out.println("Second highest Score : " + secondHighestScore);

        }
        

    }
    
}