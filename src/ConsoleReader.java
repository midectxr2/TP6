import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {
    public static int readInt(String Prompt){
        int nombre = 0;
        boolean c = true;
        while (c){
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println(Prompt);
                nombre = scanner.nextInt();
                c = false;
            } catch (Throwable e){
                c = true;
            }
        }
        return nombre;
    }
    public static void main(String[] args){
        int a = readInt("ntm");
    }
}
