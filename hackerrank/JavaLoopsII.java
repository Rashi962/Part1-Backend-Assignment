package hackerrank;

import java.util.*;

class JavaLoopsII{
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int res = a;
            for (int j = 0; j < n; j++)
            {
                res += (int)(Math.pow(2, j) * b);
                System.out.print(Integer.toString(res)  + ' ');
            }
            System.out.print('\n');
        }
        sc.close();
    }
}
