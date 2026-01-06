import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;

public class ReadingText{
    public static void main(String[] args) throws IOException{
        Path filePath = Path.of("check.txt");
        
        try(BufferedReader reader = Files.newBufferedReader(filePath)){
            
            String line = reader.readLine();
                System.out.println(line);

            while(line != null){
                line = reader.readLine();
                System.out.println(line);
            }
        }
        try(BufferedReader reader = Files.newBufferedReader(filePath);
                Stream<String> lines = reader.lines();){
                    long count = lines.count();
                    IO.print(count);

                }

    }
}