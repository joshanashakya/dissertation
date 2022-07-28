

// Java implementation of the approach  
import java.math.*; 
  
class GFG 
{ 
  
    // Function that returns true  
    // if the subsets are possible  
    public static boolean possible(int n)  
    {  
      
        // If n <= 3 then it is not possible  
        // to divide the elements in three subsets  
        // satisfying the given conditions  
        if (n > 3)  
        {  
      
            // Sum of all the elements  
            // in the range [1, n]  
            int sum = (n * (n + 1)) / 2;  
      
            // If the sum is divisible by 3  
            // then it is possible  
            if (sum % 3 == 0)  
            {  
                return true;  
            }  
        }  
        return false;  
    }  
  
    // Driver code  
    public static void main(String[] args)  
    {  
        int n = 5;  
  
        if (possible(n))  
            System.out.println("Yes");  
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by Naman_Garg 

