

// java implementation to find Average 
// of sum of first n natural even number 
import java.io.*; 
  
class GFG { 
      
    // function to find average of  
    // sum of first n even numbers 
    static int avg_of_even_num(int n) 
    { 
      
    // sum of first n even numbers 
    int sum = 0; 
      
      
    for (int i = 1; i <= n; i++)  
        sum += 2*i; 
  
    // calculating Average  
    return (sum / n); 
    } 
    public static void main (String[] args) { 
      
    int n = 9; 
    System.out.print(avg_of_even_num(n)); 
              
    } 
} 
  
// this code is contributed by 'vt_m' 

