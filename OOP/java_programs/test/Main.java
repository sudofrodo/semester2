import java.nio.file.Path;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.util.stream.Stream;
import java.nio.file.DirectoryStream;
import java.nio.file.attribute.BasicFileAttributes;
public class Main {
    
    public static void main(String[] args) {
        Path path = Path.of("TextFile.txt");

        //creating a new file
        try{
           Files.createFile(path);
           System.out.println("File created at: " + path.toAbsolutePath());
        } catch (IOException e){
            System.out.println("Exception : " + e.getMessage() + " already exists.");
        }

        //writing file through write string;
        try{
            String content = "This is a textfile.";
            Files.writeString(path, content);
            Files.writeString(path, "\nIt is working.", StandardOpenOption.APPEND);
            System.out.println("File written successfully.");
        } catch(IOException e){
            System.out.println(e.getMessage());
        }

        //reading files through read string
        try{
            String content = Files.readString(path);
            System.out.println("File contents: ");
            System.out.println(content);
        } catch (IOException e){
            System.out.println("Error reading the file : " + e.getMessage());
        }

        //not a good way to handle large files , as it loads all of it into memory so we used buffered reading and writing

        // Path buffered = Path.of("Buffered.txt");
        // try{
        //     Files.createFile(buffered);
        //     System.out.println("File created successfully.");
        // } catch (IOException e){
        //     System.out.println("Exception : " + e.getMessage() + " already exists.");
        // }

        //writing through buffered stream
        // String s = "This file is created through Buffered writing.\nThis is also working.";
        // try(BufferedWriter writer = Files.newBufferedWriter(buffered)){
        //     writer.write(s,0,s.length());
        // } catch(IOException e){
        //     e.printStackTrace();
        // }

        //reading through buffered stream
        // try(BufferedReader reader = Files.newBufferedReader(buffered)){
        //     String line = reader.readLine();
        //     while(line != null){
        //         System.out.println(line);
        //         line = reader.readLine();
        //     }
        // } catch(IOException e){
        //     e.printStackTrace();
        // }
         
        //charsets 
        // file already exists no need to create. */
        // System.out.println("\nHamlet\n");
        // Path hamlet = Path.of("sleep.txt");
        // Charset newCharSet = Charset.forName("US-ASCII");
        // try(BufferedReader reader = Files.newBufferedReader(hamlet,newCharSet)){
        //     String line = reader.readLine();
        //     while(line != null){
        //         System.out.println(line);
        //         line = reader.readLine();
        //     }
        // } catch(IOException e){
        //     System.out.println("Error: " + e.getMessage());
        // }

        //directory operations

        //creating directories;
        // String separator = FileSystems.getDefault().getSeparator();
        // try{
        //     Path filePath = Path.of("data"+separator+"test2.txt");
        //     Files.createDirectories(filePath.getParent());
        //     Files.createFile(filePath);
        // } catch(IOException e){
        //     e.printStackTrace();
        // }
            
        //walking directories
        // Path start = Path.of(".."+separator+".."+separator+".."+separator);
        // try(Stream<Path> stream = Files.walk(start,3)){ //go 3 levels down
        //     stream.forEach(System.out::println);
        // } catch(IOException e){
        //     e.printStackTrace();
        // }

        //finding files
        // Path currentDir = Path.of(".");
        // try(DirectoryStream<Path> stream = Files.newDirectoryStream(currentDir,"*.java")){
        //     System.out.println("Files Found: ");
        //     for(Path entry : stream){
        //         System.out.println(entry.getFileName());
        //     }
        // } catch(IOException e){
        //     e.printStackTrace();
        // }

        //checking file attributes
        // try{
        //     BasicFileAttributes attr = Files.readAttributes(hamlet, BasicFileAttributes.class);
        //     System.out.println("Size: " + attr.size());
        //     System.out.println("Date Created: " + attr.creationTime());
        //     System.out.println("Last Modified: " + attr.lastModifiedTime());
        // } catch(IOException e){
        //     e.printStackTrace();
        // }
    } 
}
