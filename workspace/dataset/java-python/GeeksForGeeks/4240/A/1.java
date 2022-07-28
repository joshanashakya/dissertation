

// Java implementation of the approach 
import java.util.*; 
  
public class GFG { 
  
    // Function to return an ArrayList containing 
    // all the perfect squares upto n 
    public static ArrayList<Integer> getPerfectSquares(int n) 
    { 
        ArrayList<Integer> perfectSquares = new ArrayList<>(); 
        int current = 1, i = 1; 
  
        // while current perfect square is less than or equal to n 
        while (current <= n) { 
            perfectSquares.add(current); 
            current = (int)Math.pow(++i, 2); 
        } 
        return perfectSquares; 
    } 
  
    // Function to return the count of triplet (a, b, c) pairs 
    // such that a^2 + b^2 = c^2 and 1 <= a <= b <= c <= n 
    public static int countTriplets(int n) 
    { 
        // List of perfect squares upto n^2 
        ArrayList<Integer> perfectSquares 
            = getPerfectSquares((int)Math.pow(n, 2)); 
  
        int count = 0; 
        for (int a = 1; a <= n; a++) { 
            int aSquare = (int)Math.pow(a, 2); 
            for (int i = 0; i < perfectSquares.size(); i++) { 
                int cSquare = perfectSquares.get(i); 
  
                // Since, a^2 + b^2 = c^2 
                int bSquare = cSquare - aSquare; 
                int b = (int)Math.sqrt(bSquare); 
                int c = (int)Math.sqrt(cSquare); 
  
                // If c < a or bSquare is not a perfect square 
                if (c < a || !perfectSquares.contains(bSquare)) 
                    continue; 
  
                // If triplet pair (a, b, c) satisfy the given condition 
                if ((b >= a) && (b <= c) && (aSquare + bSquare == cSquare)) 
                    count++; 
            } 
        } 
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 10; 
  
        System.out.println(countTriplets(n)); 
    } 
} 

