public class Main{
    public static void main(String[] args){
        Character jari = new Character(12,"jari", 14);
        Character hari = new Character(jari);
        //checking addresses of both objects;
        System.out.println(hari == jari); // this will return false beacause of new keyword.
        //Character hari = jari; //this will reference the same object , change will effect both;
        System.out.println(hari.getAge());
        System.out.println(jari.getName() == hari.getName());
        hari.setName("hari");
        System.out.println(hari.getName());
        System.out.println(jari.getName());

        Character brother = jari.shallowCopy();
        System.out.println(brother.getAge() == jari.getAge());
        System.out.println(jari == brother); //this will return true , because its a shallow copy;

        Character cousin = jari.deepCopy();
        System.out.println(cousin == jari); //this will return false, because its a deep copy.
    }
}
/*
Conclusion:
new keyword makes new reference ,
just assigning the object to other variable will make same reference;
simple "return this" will also make the same reference;
"return new(this) will return different reference"
*/