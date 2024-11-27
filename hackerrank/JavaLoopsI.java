package hackerrank;

import java.util.Scanner;
public class JavaLoopsI {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        for(int i=1;i<11;i++) {
            int result=num*i;
            String mulValue=num+" x "+i+" = "+result;
            System.out.println(mulValue);
            s.close();
        }
    }
}
