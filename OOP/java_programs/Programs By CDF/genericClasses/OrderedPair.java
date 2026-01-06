import java.util.ArrayList;
import java.util.Collections;

interface Multitypes<K, V>{
    public K getKey();
    public V getValue();
}
public class OrderedPair<K,V> implements Multitypes{
    private K key;
    private V value;

    public OrderedPair(K key, V value){
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public V getValue(){
        return value;
    }
    public void printKeyValues(){
        System.out.println(key + ":" + value);
    }
    public static <K,V> void main(String[] args) {
        OrderedPair<String, Integer> p1 = new OrderedPair<>("Athar" , 12);
        OrderedPair<String, String> p2 = new OrderedPair<>("finarfin" , "elf");
        ArrayList<OrderedPair> listAPairs = new ArrayList<>();
        Collections.addAll(listAPairs, p1,p2);
        for(OrderedPair<K,V> pair : listAPairs){
            pair.printKeyValues();
        }
    }
}
