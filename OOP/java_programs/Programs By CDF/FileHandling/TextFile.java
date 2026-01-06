
import java.io.File;

public class TextFile{
    public static void main(String[] args) {
        File myFile = new File("treasure.txt");
        if(!myFile.exists()){
            System.out.println("There is no such file.");
        } else if(!myFile.canRead()){
            System.out.println("File is not readable");
        } else {
            System.out.println("Reading file.");
        }
    
    }
}