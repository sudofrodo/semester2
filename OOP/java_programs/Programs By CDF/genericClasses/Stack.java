import java.util.ArrayList;
public class Stack<T>{
    private final ArrayList<T> elements;
    public Stack(){
        this(10);
    }

    public Stack(int capacity){
    int initCapacity = capacity > 0 ? capacity : 10;
    elements = new ArrayList<T>(initCapacity);
    }
    
    public void push(T... pushValue){
    for(T value : pushValue){
      elements.add(value);  
    }	
    }

    public T pop(){
      if(elements.isEmpty()){
        throw new EmptyStackException("Stack is empty , cannot pop");
      }
      return elements.remove(elements.size() - 1);
    }
    public void printStack(){
     for(T element : elements){
        System.out.println(element);
      }
    }

    public static void main(String[] args){
      Stack<Double> doubleStack = new Stack<>(3);
      doubleStack.push(10.04,11.09,13.95);
      Stack<Integer> integerStack = new Stack<>(5);
      integerStack.push(3,4,5,6,7);

//      doubleStack.printStack();
      integerStack.printStack();
      int popped = integerStack.pop();
      integerStack.printStack();
      System.out.println("popped value " + popped);
    }
}

class EmptyStackException extends RuntimeException
{
  public EmptyStackException(){
    this("Stack is Empty");
  }
  public EmptyStackException(String message){
    super(message);
  }


}
