import java.util.Scanner;
  public class Student{
  private String studentName;
  private int[] marks;
  public Student(){};
  public Student(String name , int[] numbers){
  studentName = name;
  marks = numbers;
  }
  public static double calculateGPA(int[] numbers){
  int sum = 0;
  for (int value : numbers){
      sum += value;
  }
  double marksAvg = sum / numbers.length;
  double gpa = marksAvg / 25;
  if (gpa > 4.0) {
    return 4.0;
  }
  return gpa;
  }

  public char[] getGrades() {
  char[] gradesArray = new char[marks.length];
  for (int i = 0; i <= marks.length - 1 ; i++) {
    int value = marks[i];
    char grade;
  if (value >= 90) {
    grade = 'A';
  } else if (value >= 80) {
    grade = 'B';
  } else if (value >= 70) {
    grade = 'C';
  } else if (value >= 60) {
    grade = 'D';
  } else {
    grade = 'F';
  }
  gradesArray[i] = grade;
  }
  return gradesArray;
}
  public void displayDetails(){
  int size = marks.length;
  char[] grades = getGrades();
  String gradeList = "[";
  for (int i = 0 ; i <= size - 1 ; i++) {
    gradeList += grades[i]; 
    if (i != size - 1) {
      gradeList += ", "; 
    }
  }
  gradeList += "]";
  System.out.println("Student: " + studentName + ", GPA: " + calculateGPA(marks) + ", Grades: " + gradeList);
  }
  public static void main(String args[]){
  System.out.print("Enter the number of students: ");
  Scanner input = new Scanner(System.in);
  int numOfStudents = input.nextInt();
  input.nextLine();
  Student[] stdArray = new Student[numOfStudents];
  for (int i = 0 ; i < numOfStudents ; i++ ) {
    System.out.print("Name : ");
    String name = input.nextLine();
    System.out.print("Number of Subjects: ");
    int subs = input.nextInt();
    input.nextLine();
    int[] marksArray = new int[subs] ;
    for (int j = 0 ; j < subs; j++) {
    System.out.print("Enter marks: ");
    marksArray[j] = input.nextInt();
    input.nextLine();
    }
    Student std = new Student(name , marksArray);
    stdArray[i] = std;
  }
  System.out.println("=============================================");
  Student topPerformer = null;
  String topPerformerName = "";
  double minGPA = 0.0;
  for (Student std : stdArray) {
  std.displayDetails();
  double currentGPA = std.calculateGPA(std.marks);
  if (currentGPA > minGPA) {
    topPerformer = std;
    minGPA = currentGPA;
  }
  };
  System.out.println("Top Performer: " + topPerformer.studentName);
  
};
}
