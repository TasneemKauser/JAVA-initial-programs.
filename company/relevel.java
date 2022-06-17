package com.company;
import java.util.*;
public class relevel {
    // Java program for the above approach
    class GFG {
        // Function to find the minimum
        // number of rabbits in the forest
        public static int minNumberOfRabbits(int[] answers,
                                             int N)
        {
            // Initialize map
            Map<Integer, Integer> map
                    = new HashMap<Integer, Integer>();

            // Traverse array and map arr[i]
            // to the number of occurences
            for (int a : answers) {
                map.put(a, map.getOrDefault(a, 0) + 1);
            }

            // Initialize count as 0;
            int count = 0;

            // Find the number groups and
            // no. of rabbits in each group
            for (int a : map.keySet()) {
                int x = a;
                int y = map.get(a);

                // Find number of groups and
                // multiply them with number
                // of rabbits in each group
                if (y % (x + 1) == 0) {
                    count = count + (y / (x + 1)) * (x + 1);
                }
                else
                    count
                            = count + ((y / (x + 1)) + 1) * (x + 1);
            }

            // count gives minimum number
            // of rabbits in the forest
            return count;
        }

        // Driver Code
        public static void main(String[] args)
        {
            Scanner Sp=new Scanner(System.in);
            int N =Sp.nextInt();
            int[] arr=new int[100];
            for (int i=0;i<N;i++){
                arr[i]=Sp.nextInt();
            }

            // Function Call
            System.out.println(minNumberOfRabbits(arr, N));
        }
    }

}
