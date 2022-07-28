

// Java program to find the sum of series  
  
public class GFG { 
      
    // Function to return required sum  
    static int sum(int x, int y, int n)  
    {  
      
        // sum of first series  
        int sum1 = (int) (( Math.pow(x, 2) * (Math.pow(x, 2 * n) - 1))  
                   / (Math.pow(x, 2) - 1));  
      
        // sum of second series  
        int sum2 = (int) ((x * y * (Math.pow(x, n) * Math.pow(y, n) - 1)) 
                    / (x * y - 1));  
      
        return sum1 + sum2;  
    }  
      
    // Driver code  
    public static void main (String args[]){ 
        int x = 2, y = 2, n = 2;  
          
        // function call to print sum  
        System.out.println(sum(x, y, n));  
    } 
  
// This code is contributed by ANKITRAI1 
} 

