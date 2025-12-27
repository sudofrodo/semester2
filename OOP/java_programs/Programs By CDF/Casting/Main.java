import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
        Parent p = new Parent(4, "Father");
        Child c =  new Child(3 ,5, "Son");
        Child2 c2 = new Child2(45,56, "Daughter");
        System.out.println(p.getX());
        System.out.println(c.getY());
        System.out.println(c.getX());
        Parent p2 = new Child(5,6,"OffSpring"); //this is upcasting;
        p2.getX(); //child method called.
        Parent p3 = c; //another upcasting
        p.checkEligibility(c); //this is also upcasting , child provided where parent required
        //upcasting is not really done , so we can access parent method , that we can already do 
        //we upcast for grouping and flexiblity , for being generic , e.g a function which can apply on all 
        //children can be defined using parent parameter , so we dont have to seperately write the function for all children
        //also this can be helpful in list
        ArrayList<Parent> list = new ArrayList<>();
        list.add(c);
        list.add(c2);

        Parent p4 = new Child(8,9,"Son2");
        //p4.getY(); //only overrided child methods can be accessed , so we will downcast.
        //Child c4 = p4; implicit downcasting is not possible
        Child c4 = (Child) p4;
        System.out.println(c4.getY()); //now possible

        
        // Parent p5 = new Parent(50);
        // Child c5 = (Child) p5;
        // System.out.println(c5.getY());
        //this is not possible , only parents who hold reference to childs can be downcasted

        //if parent and child have same name variables , it will be decided at compile time which to access. java checks the
        //reference type for variables and static functions at compilation , and actual object type for methods at runtime, So
        Parent p6 = new Child(78,67,"Child of P6");
        System.out.println(p6.getName()); //it gives null , even though we gave the name for child but parent name is null;
        System.out.println(p6.getX()); 

        //static methods cant be overrided they are hidden.
        p6.show(); //checking at compile time. 
        //its better we call static functions through class names.
    }
}  