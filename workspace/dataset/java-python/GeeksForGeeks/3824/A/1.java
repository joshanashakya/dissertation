

// Java implementation of the above approach  
  
public class GFG{ 
  
    // Function to print the required numbers  
    static void find(int n)  
    {  
        // Suppose b = n and we want a % b = 0 and also  
        // (a / b) < n so a = b * (n - 1)  
        int b = n;  
        int a = b * (n - 1);  
      
        // Special case if n = 1  
        // we get a = 0 so (a * b) < n  
        if (a * b > n && a / b < n) {  
            System.out.print("a = " + a + ", b = " + b);  
        }  
      
        // If no pair satisfies the conditions  
        else
            System.out.println(-1);  
    }  
      
    // Driver code  
    public static void main(String []args) 
    {  
        int n = 10;  
        find(n);  
    }  
    // This code is contributed by Ryuga 
} 

