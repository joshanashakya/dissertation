

// Java  program to find distinct integers  
// ontained by lcm(x, num)/x  
  
import java.io.*; 
  
class GFG { 
      
// Function to count the number of distinct  
// integers ontained by lcm(x, num)/x  
static int numberOfDistinct(int n)  
{  
    int ans = 0;  
  
    // iterate to count the number of factors  
    for (int i = 1; i <= Math.sqrt(n); i++) {  
        if (n % i == 0) {  
            ans++;  
            if ((n / i) != i)  
                ans++;  
        }  
    }  
  
    return ans;  
}  
  
// Driver Code  
    public static void main (String[] args) { 
        int n = 3;  
  
        System.out.println (numberOfDistinct(n));  
  
  
    } 
} 

