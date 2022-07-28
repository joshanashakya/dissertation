

// Java program to find sum of first n terms  
  
public class GFG { 
      
    // Function to calculate the sum  
    static int calculateSum(int n)  
    {  
        
        return n * (n + 1) / 2  
               + (int)Math.pow((n * (n + 1) / 2), 2);  
    }  
      
    // Driver code 
    public static void main(String args[]) 
    { 
        // number of terms to be  
        // included in the sum  
        int n = 3;  
        
        // find the Sum  
        System.out.println("Sum = "+ calculateSum(n));  
    } 
    // This Code is contributed by ANKITRAI1 
} 

