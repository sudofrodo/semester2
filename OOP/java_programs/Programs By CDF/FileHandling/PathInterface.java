import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class PathInterface{
    public static void main(String[] args) {
            Path p1 = Paths.get("test.txt");
            //converting a path to absolute path
            Path fullPath = p1.toAbsolutePath();
            System.err.println(fullPath.toString());
            Path p2 = Path.of("check.txt");
            Path justPath = Paths.get("/home/athar/semester2/OOP/javaPrograms/javaConcepts/FileHandling");
            //joining two paths
            System.out.println(justPath.resolve(p2));
            justPath = justPath.resolve(p2);
            System.out.println(justPath.toString());
            Path p3 = Paths.get("/home/athar/semester2/OOP/javaPrograms/javaConcepts/FileHandling/hitman.txt");
            System.out.println(p2.toString());
            System.out.println(p3.getFileName());
            System.out.println(p3.getNameCount());
            //comparing two paths
            System.out.println(justPath.equals(p3));
            FileSystem fileSystem = FileSystems.getDefault();
            for(FileStore store: fileSystem.getFileStores()){
                System.out.println(store.name() +" - " + store.type());
            }

            for (Path directory : fileSystem.getRootDirectories()) {
            boolean readable = Files.isReadable(directory);
                System.out.println("directory = " + directory + " - " + readable);
            }
        boolean isRegularExeFile = Files.isWritable(p2);
        try{
        boolean isSameFile = Files.isSameFile(p3, p2);
        Files.delete(p3);
        Files.deleteIfExists(justPath);
         System.out.println(isSameFile);
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        //get seperator on os
        String separator = FileSystems.getDefault().getSeparator();
        System.out.println(separator);
        //Files.move(source,target,options)
        //System.out.println(isRegularExeFile);
       

    }
}
