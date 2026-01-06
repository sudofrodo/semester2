import java.util.Scanner;
public class QuadraticRoots{
  private double a,b,c;
  private double root1, root2;
  public QuadraticRoots() {}
  public QuadraticRoots(int a , int b , int c){
  this.a = a;
  this.b = b;
  this.c = c;  
  }
  public void setA(int a){
    this.a  = a;
  };
  public void setB(int b){
    this.b = b;
  };
  public void setC(int c){
    this.c = c;
  }

  public double getA(){
  return a;
  }
public double getB(){
  return b;
  }
  public double getC(){
  return c;
  }
  
  public void computeRoots(){
    double inverse = -b;
    double sqrt = Math.sqrt(b * b - 4 * a * c);
    double divider = 2 * a;
    root1 = (inverse + sqrt) / divider; 
    root2 =  (inverse - sqrt) / divider; 
  };
  public void displayRoots(){
    System.out.printf("Root 1 %.2f\n" , root1);
    System.out.printf("Root 2 %.2f\n" , root2);
  }

  public static void main(String[] args) {
    QuadraticRoots qr1 = new QuadraticRoots();
    Scanner input = new Scanner(System.in);
    System.out.print("Enter num1 : ");
    qr1.setA(input.nextInt());
    System.out.print("Enter num2 : ");
    qr1.setB(input.nextInt());
    System.out.print("Enter num3 : ");
    qr1.setC(input.nextInt());
    
    qr1.computeRoots();
    qr1.displayRoots();



  }
 
}
