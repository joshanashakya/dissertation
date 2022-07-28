

// Java program for the Optimal Solution 
import java.io.*; 
import java.util.*; 
  
class GFG { 
  
    // Function to calculate the maximum points 
    // earned by making an optimal selection on 
    // the given array 
    static int findOptimalSolution(int[] a, int N) 
    { 
        // Sorting the array 
        Arrays.sort(a); 
  
        // Variable to store the total points earned 
        int points = 0; 
  
        for (int i = 0; i < N; i++) { 
            points += a[i] * i; 
        } 
        return points; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int[] a = { 1, 4, 2, 3, 9 }; 
        int N = a.length; 
        System.out.println(findOptimalSolution(a, N)); 
    } 
} 

