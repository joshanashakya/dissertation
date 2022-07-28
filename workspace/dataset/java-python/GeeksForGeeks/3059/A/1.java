

// Java implementation of the approach  
   
import java.util.*; 
  
class GFG{  
  
// Function to return the maximized value of A  
static String maxValue(char []a, char []b)  
{  
    // Sort digits in ascending order  
    Arrays.sort(b);  
    int n = a.length;  
    int m = b.length;  
  
    // j points to largest digit in B  
    int j = m - 1;  
    for (int i = 0; i < n; i++) {  
  
        // If all the digits of b have been used  
        if (j < 0)  
            break;  
  
        if (b[j] > a[i]) {  
            a[i] = b[j];  
  
            // Current digit has been used  
            j--;  
        }  
    }  
  
    // Return the maximized value  
    return String.valueOf(a);  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    String a = "1234";  
    String b = "4321";  
  
    System.out.print(maxValue(a.toCharArray(), b.toCharArray()));  
} 
}  
  
// This code is contributed by PrinciRaj1992 

