
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.nio.file.Files;

public class WritingText{
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("mubashir.txt");
       // Files.createFile(filePath);
        Charset charset = Charset.defaultCharset();
        Charset newCharSet = Charset.forName("US-ASCII");
        
        String s = "Mubashir Nazar is a GOOD boy.";
        try(BufferedWriter writer = Files.newBufferedWriter(filePath, charset)){
            writer.write(s,0,s.length());
        }
    }
}