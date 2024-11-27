package hackerrank;

import java.util.*;
public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
    Set<Integer> uniqueElements = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
             deque.addLast(num);
        uniqueElements.add(num);
         if (deque.size() == m) {
    
            maxUnique = Math.max(maxUnique, uniqueElements.size());

            int removedElement = deque.removeFirst();
            
            if (!deque.contains(removedElement)) {
                uniqueElements.remove(removedElement);
            }
        }
           
        }
        System.out.println(maxUnique);
    }
}