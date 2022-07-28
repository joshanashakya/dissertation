

// Java program to find Minimum number to be added  
// to all digits of X to make X > Y 
import java.util.*; 
  
class GFG  
{ 
  
    // Function to check if X 
    // is lexicographically larger Y 
    static boolean IsLarger(int[] X, 
                            int[] Y, int n)  
    { 
        for (int i = 0; i < n; i++) 
        { 
  
            // It is lexicographically larger 
            if (X[i] < Y[i])  
            { 
                return false; 
            } 
        } 
        return true; 
    } 
  
    // Utility function to check 
    // minimum value of d 
    static int solve(int X[], int Y[], int n)  
    { 
        int ans = 0; 
          
        // If X is already larger 
        // do not need to add anything 
        if (IsLarger(X, Y, n)) 
            ans = 0; 
        else 
        { 
  
            // Adding d to all elements of X 
            int d = Y[0] - X[0]; 
  
            for (int i = 0; i < n; i++) 
                X[i] += d; 
  
            // If X is larger now 
            // print d 
            if (IsLarger(X, Y, n)) 
                ans = d; 
  
            // else print d + 1 
            else
            { 
                ans = d + 1; 
            } 
        } 
        return ans; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
          
        // Taking the numbers as sequences 
        int X[] = { 2, 3, 6, 9 }; 
        int Y[] = { 3, 4, 8, 1 }; 
  
        int n = X.length; 
        System.out.println(solve(X, Y, n)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

