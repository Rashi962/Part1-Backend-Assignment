package hackerrank;
import java.util.Scanner;

public class JavaEndofFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String line;
        int i = 1;
        while(sc.hasNext())
        {
            line = sc.nextLine();
            System.out.println(i + " "+ line);
            i++;
        }
        sc.close();
    }
}