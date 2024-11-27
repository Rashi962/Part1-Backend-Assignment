package hackerrank;

import java.io.*;
import java.util.*;

public class Java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
         // Variable to store the maximum sum of hourglasses
        int maxSum = Integer.MIN_VALUE;

        // Loop over the possible top-left corners of the hourglasses
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Calculate the sum of the current hourglass
                int top = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2);
                int middle = arr.get(i+1).get(j+1);
                int bottom = arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);

                int hourglassSum = top + middle + bottom;

                // Update the maxSum if the current hourglass sum is greater
                if (hourglassSum > maxSum) {
                    maxSum = hourglassSum;
                }
            }
        }

        // Output the result
        System.out.println(maxSum);
    }
}
