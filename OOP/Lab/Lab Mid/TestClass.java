import java.util.Scanner;
public class TestClass{
    public static void main(String[] args){
        ResidentialConnection rc1 = new ResidentialConnection("R-103", 200);
        //input by constructor
        rc1.payBill(2400);
        rc1.displayInfo();

        System.out.println();
        ResidentialConnection rc2 = new ResidentialConnection();
        //input by setter methods
        rc2.setConnectionId("R-105");
        rc2.setConsumedUnits(300);
        rc2.payBill(3000);
        rc2.displayInfo();
        
        System.out.println();
        ResidentialConnection rc3 = new ResidentialConnection();
        //input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter id: ");
        rc3.setConnectionId(input.next());
        System.out.print("Enter Units: ");
        rc3.setConsumedUnits(input.nextInt());
        rc3.payBill(1000);
        rc3.displayInfo();
        
       
        

    }
}