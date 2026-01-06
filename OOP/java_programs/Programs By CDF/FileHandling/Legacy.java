import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Legacy{
    public static void main(String[] args) {
     File file = new File("message.txt");
     try{
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.write("Hello this is written through legacy code.");
        writer.write("\nIt is working.");
        writer.close();
     } catch(IOException e){
        e.printStackTrace();
     }


     try{
        FileReader reader = new FileReader(file);
        int data = reader.read();
        while(data != -1){
            System.out.print((char) data);
            data = reader.read();
        }
        reader.close();
     } catch(IOException e){
        e.printStackTrace();
     }
    }
}