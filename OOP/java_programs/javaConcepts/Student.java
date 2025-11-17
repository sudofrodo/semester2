public class Student{
    int id;
    double marks;
    public Student(int id,double marks){
        this.id = id;
        this.marks = marks;
    }
    public Student(Student s){
        this.id = s.id;
        this.marks = s.marks;
    }
    public static void main(String[] args){
        Student s1 = new Student(24,23);
        Student s2 = new Student(s1);
        System.out.println(s1.id);
        System.out.println(s2.id);
        s2.id = 1;
        System.out.println(s2.id);
        System.out.println(s1.id);
    }
}

