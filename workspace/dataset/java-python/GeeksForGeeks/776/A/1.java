

// Java implementation of the above approach  
import java.util.*; 
  
public class GfG{ 
  
    // Function to count the numbers  
    public static int findNumbers(int N)  
    {  
        // Initialize vector array that store  
        // result.  
        ArrayList<Integer> v = new ArrayList<Integer>();  
        
        // Get the each decimal and find its  
        // count store in vector.  
        while (N > 0) {  
        
            int n = N, m = 0, p = 1;  
            while (n > 0) {  
        
                // find decimal  
                if (n % 10 != 0)  
                  m += p;  
        
                n /= 10;  
                p *= 10;  
            }  
        
            v.add(m);  
        
            // Decrement N by m for each decimal  
            N -= m;  
        }  
        
        // Loop for each element of vector  
        // And print its content.  
        for (int i = 0; i < v.size(); i++)  
            System.out.print(" " + v.get(i));  
        
        return 0;  
    }  
  
     public static void main(String []args){ 
          
        int N = 31;  
        findNumbers(N);  
     } 
} 
  
// This code is contributed by Rituraj Jain 

