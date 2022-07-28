

// Java code to generate 'Nth' terms 
// of this sequence 
import java.lang.Math; 
class GFG { 
  
    // Function to generate a fixed \number 
    public static int nthTerm(int N) 
    { 
        int nth = 0, i; 
  
        // Finding nth term 
        for (i = N; i > 0; i--) { 
  
            nth += Math.pow(i, i); 
        } 
        return nth; 
    } 
  
    // Driver Method 
    public static void main(String[] args) 
    { 
        int N = 3; 
        System.out.println(nthTerm(N)); 
    } 
} 
// This code is contributed by 29AjayKumar 

