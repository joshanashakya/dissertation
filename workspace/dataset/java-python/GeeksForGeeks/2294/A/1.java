

// Java program to Find N digits 
// number which is divisible by D 
  
import java.io.*; 
  
class GFG { 
  
  
// Function to return N digits 
// number which is divisible by D 
static String findNumber(int n, int d) 
{ 
    // to store answer 
    String ans = ""; 
  
    if (d != 10) { 
        ans += Integer.toString(d); 
        for (int i = 1; i < n; i++) 
            ans += '0'; 
    } 
    else { 
        if (n == 1) 
            ans += "Impossible"; 
        else { 
            ans += '1'; 
            for (int i = 1; i < n; i++) 
                ans += '0'; 
        } 
    } 
  
    return ans; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
            int n = 12, d = 3; 
  
    System.out.println(findNumber(n, d)); 
    } 
} 
// This code is contributed by anuj_67.. 

