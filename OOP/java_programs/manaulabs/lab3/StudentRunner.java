class Student{
  private String name;
  private int resultArray[] = new int[5];
  Student() {};
  Student(String sName , int[] sMarks) {
  name = sName;
  for (int i = 0 ; i <= 4; i++) {
    resultArray[i] = sMarks[i];
  }
  }

  public String getName() {
    return name;
  }
  public int[] getResultArray() {
    return resultArray;
  }

  public double Average() {
    int markSum = 0;
    for (int i = 0 ; i <= 4; i++) {
      markSum += resultArray[i];
    }
    return markSum / 5;
  }
}

public class StudentRunner{
  public static void main(String args[]) {
    int[] marksArrayS1 = {10,20,30,40,50};
    int[] marksArrayS2 = {5,15,25,35,35};
    Student s1 = new Student("athar" , marksArrayS1);
    Student s2 = new Student("badar" , marksArrayS2);
    
    double avgS1 = s1.Average();
    double avgS2 = s2.Average();
    
    String comparison = (avgS1 > avgS2) ? "Student s1 has greater average then student s2." : "Student s2 has greater average then student s1.";
    System.out.println(comparison);

    Student s3 = new Student(s1.getName() , s2.getResultArray());
    System.out.println("Average s3 : " + s3.Average());
  }
}




