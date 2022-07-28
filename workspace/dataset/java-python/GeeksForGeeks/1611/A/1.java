

// java program to find sum of matrix element 
// where each element is integer division of 
// row and column. 
  
import java.io.*; 
  
class GFG { 
      
    // Return sum of matrix element where each 
    // element is division of its corresponding 
    // row and column. 
    static int findSum(int n) 
    { 
        int ans = 0, temp = 0, num; 
      
        // For each column. 
        for (int i = 1; i <= n && temp < n; i++) 
        { 
              
            // count the number of elements of 
            // each column. Initialize to i -1 
            // because number of zeroes are i - 1. 
            temp = i - 1; 
      
            // For multiply 
            num = 1; 
      
            while (temp < n) 
            { 
                if (temp + i <= n) 
                    ans += (i * num); 
                else
                    ans += ((n - temp) * num); 
      
                temp += i; 
                num ++; 
            } 
        } 
      
        return ans; 
    } 
      
    // Driven Program 
    public static void main (String[] args)  
    { 
        int N = 2; 
        System.out.println(findSum(N)); 
    } 
} 
  
// This code is contributed by anuj_67. 

