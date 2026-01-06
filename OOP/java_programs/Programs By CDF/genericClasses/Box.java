 //bounded types

import java.io.Serializable;

public class Box<T>{
    private T t;

    public Box(T t){
        this.t = t;
    }
    public void setT(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

    public <U extends Number> void check(U u){
        System.out.println("T : " + t.getClass().getName());
        System.out.println("U : " + u.getClass().getName());
    }
}
interface A{};
interface B{};
//we can have mutliple bounds
class Box2<T extends String  & Comparable<String> & Serializable> {
    private T t;
    
    
    public void setT(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

    public static void main(String[] args){
        //Box2<Double> d = new Box2<>(); double is not within the bounds of T
        Box2<String> s = new Box2<>();
        s.setT("athar");
        System.out.println(s.get());

        
    }

    //multibounded function
    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
    int count = 0;
    for (T e : anArray)
        if (e.compareTo(elem) > 0)
            ++count;
    return count;
    }
    
    //wildcards
    //upperbounded.
    public static double void sumofList(<List<? extends Number> list>){
        double s = 0.0;
        for(Number n : list)
            s += n.doubleValue();
        return s;
    }
    
    //unbounded
    public static void printList(List<?> list){
        for(Object elem: list)
            System.out.println(elem + " ");
        System.out.println;
    }

    //lowerbounded
    public static void addNumbers(List<? super Integer> list){
        for(int i = 1; i <= 10; i++){
            list.add(i);
        }
    }


}



