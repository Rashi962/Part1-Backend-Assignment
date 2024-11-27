package hackerrank;

import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class JavaMD5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();
        
        try {
            /* Encode the String using MD5 */
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] digest = md.digest();
            
            /* Print the encoded value in hexadecimal */
            for (byte b : digest) {
                System.out.format("%02x", b);
            }
        } catch (NoSuchAlgorithmException e) {
            // Handle the exception if MD5 is not available
            e.printStackTrace();
        }
    }
}
