import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Main{
    public static void main(String[] args) {
        Mobile m = new Mobile("oppo", 2013,1,39000);
        try{
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("mobile.ser"));
            output.writeObject(m);
            output.close();
        } catch(IOException e){
            e.printStackTrace();
        }
        m.price = 40000;
        
        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("mobile.ser"));
            Mobile mCopy = (Mobile) input.readObject();
            System.out.println(mCopy.getCompany() + "  " + mCopy.getReleaseYear() + "  " + mCopy.getId() + "  " + mCopy.getPrice());
            input.close();
        } catch(IOException e){
            e.printStackTrace();
        } catch(ClassNotFoundException c){
            c.printStackTrace();
        }
    }
}