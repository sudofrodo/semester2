import java.io.IOException;
public class ConsoleUtility
{
    public static void clearScreen() {
        int secondsToPause = 1;
        try {
            int milliseconds = secondsToPause * 1000;
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); 
            System.err.println("Pause interrupted.");
        }

        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }

    
}
