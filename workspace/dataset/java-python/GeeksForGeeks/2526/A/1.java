

// Java program to find the minimum  
// number of additional cuts required 
// to make circle segments equal sized 
import java.util.Arrays; 
  
class GFG 
{ 
      
// Recursive function to  
// return gcd of two nos 
static int findgcd(int a, int b)  
{  
    if (b == 0)  
        return a;  
    return findgcd(b, a % b);  
}  
  
// Function to find the minimum number 
// of additional cuts required to make 
// circle segments are equal sized 
static int minimumCuts(int a[], int n) 
{ 
    // Sort the array 
    Arrays.sort(a); 
  
    // Initial gcd value 
    int gcd = a[1] - a[0]; 
    int s = gcd; 
  
    for (int i = 2; i < n; i++)  
    { 
        gcd = findgcd(gcd, a[i] - a[i - 1]); 
        s += a[i] - a[i - 1]; 
    } 
  
    // Inlcuding the last segment 
    if (360 - s > 0) 
        gcd = findgcd(gcd, 360 - s); 
  
    return (360 / gcd) - n; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int[] arr = new int[] { 30, 60, 180 }; 
  
    int n = arr.length; 
  
    System.out.println(minimumCuts(arr, n)); 
} 
} 
  
// This code is contributed by mits 

