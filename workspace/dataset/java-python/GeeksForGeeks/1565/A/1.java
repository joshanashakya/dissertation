

// Java program to count the 
// number of intervals in which 
// a given value lies 
  
import java.io.*; 
import java.util.*; 
import java.lang.*; 
  
class GFG { 
  
    static final int MAX_VAL = 200000; 
  
    // Function to count the 
    // number of intervals in which 
    // a given value lies 
    static int countIntervals(int[][] arr, int V, int N) 
    { 
        // Variables to store overall minimum and 
        // maximum of the intervals 
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE; 
  
        // Variables to store start and end of an interval 
        int li, ri; 
  
        // Frequency array to keep track of 
        // how many of the given intervals an element lies in 
        int[] freq = new int[MAX_VAL]; 
  
        for (int i = 0; i < N; i++) { 
            li = arr[i][0]; 
            freq[li] = freq[li] + 1; 
            ri = arr[i][1]; 
            freq[ri + 1] = freq[ri + 1] - 1; 
  
            if (li < min) 
                min = li; 
            if (ri > max) 
                max = ri; 
        } 
  
        // Constructing the frequency array 
        for (int i = min; i <= max; i++) 
            freq[i] = freq[i] + freq[i - 1]; 
  
        return freq[V]; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int[][] arr = { { 1, 10 }, { 5, 10 },  
         { 15, 25 }, { 7, 12 }, { 20, 25 } }; 
  
        int V = 7; 
  
        // length of the array 
        int N = arr.length; 
  
        System.out.println(countIntervals(arr, V, N)); 
    } 
} 

