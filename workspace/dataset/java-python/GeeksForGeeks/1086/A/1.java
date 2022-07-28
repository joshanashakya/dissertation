

// Java program to find the count of 
// occurrences of the average of array 
// elements with a given number 
import java.io.*; 
import java.util.*; 
import java.lang.*; 
  
class GFG { 
  
    // Function to find the count of 
    // occurrences of the average of array 
    // elements with a given number 
    static void getAverageCountArray(int[] a, int x, int N) 
    { 
        // Map to store count of occurrence 
        // of every array element in the array 
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
  
        // Array that stores the average 
        // count for given array 
        int[] avg = new int[N]; 
        int val, av; 
  
        for (int i = 0; i < N; i++) { 
            // first occurrence of a[i] 
            if (!map.containsKey(a[i])) { 
                map.put(a[i], 1); 
            } 
  
            // element has already occurred before 
            // so increase its count 
            else { 
                // gives current count of a[i] 
                val = map.get(a[i]); 
                val++; 
                map.remove(a[i]); 
                map.put(a[i], val); 
            } 
        } 
  
        for (int i = 0; i < N; i++) { 
            av = (a[i] + x) / 2; 
            if (map.containsKey(av)) { 
                val = map.get(av); 
                avg[i] = val; 
            } 
        } 
  
        // Printing the average count array 
        for (int i = 0; i < N; i++) { 
            System.out.print(avg[i] + " "); 
        } 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int[] a = { 2, 0, 4, 6, 2 }; 
        int x = 2; 
  
        int N = a.length; 
  
        getAverageCountArray(a, x, N); 
    } 
} 

