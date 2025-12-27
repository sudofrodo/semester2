//Overloading and Overriding are both types of polymorphism , overloading is compile time polymorphis , while overriding is runtime
//polymophism.
public class Main{
    public static void main(String[] args) {
        Boss b = new Boss("Yusur", 300);
        Daymen light = new Daymen("light", 676, "Bends light");
        Nightmen satanSolider = new Nightmen("satansolider", 5667, "Lava eyes at night", 90);
        
        //this will be decided at runtime , which method to be called. parent or child.
        b.Info();
        light.Info();
        satanSolider.Info();


        satanSolider.mergePowers(light); //child can access parent methods. depending on access modifiers.

        //*Subtype polymorphism pivots on the notion that a subtype fits wherever a supertype is expected. 
        // This fitting might happen in an assignment statement, like these:*
        Boss b2 = new Daymen("narum", 454, "Increase intensity of light");
        b2.Info(); //if the method is overrided child method is called.
        //the type of variable is boss , but it points to child class object in memory.
       // b2.Fight(); //even though this variable holds the reference to child Daymen , but it still can't call Fight() ,
        //because fight is not defined in the boss class.
        b2.increaseXp(); //child xp being ncreased
        //a polymorphic method , boss is required but child is given and can be done so.
        b2.mergePowers(light); 
            
    }
}

//Conclusion ;
/* Child Class abilities
-- can override parent methods.
-- can access parent methods.(depending on access modifier)
-- final methods wont be changed.
   Parent class abilities
-- hold reference to childs
-- call child methods. only overrided ones.
-- cannot call child specific method in any case
*/