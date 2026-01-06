import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class FileHandling{
    public static void main(String[] args) throws IOException {
        // Path file = Paths.get("main.txt");
        // Files.createFile(file);
        //creating temporary file
        Path tempFile = Files.createTempFile(null, ".caravans");
        System.out.println(tempFile.toString());
    }
}