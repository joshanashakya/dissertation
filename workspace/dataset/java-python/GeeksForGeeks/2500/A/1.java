

// Java program to find the position of the 
// last removed element from the array 
import java.util.*; 
  
class solution 
{ 
  
// Function to find the original position 
// of the element which will be 
// removed last 
  
static int getPosition(int a[], int n, int m) 
{ 
    // take ceil of every number 
    for (int i = 0; i < n; i++) { 
        a[i] = (a[i] / m + (a[i] % m)); 
    } 
  
    int ans = -1, max = -1; 
    for (int i = n - 1; i >= 0; i--) { 
        if (max < a[i]) { 
            max = a[i]; 
            ans = i; 
        } 
    } 
  
    // Since position is index+1 
    return ans + 1; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int a[] = { 2, 5, 4 }; 
  
    int n = a.length; 
  
    int m = 2; 
  
System.out.println(getPosition(a, n, m)); 
  
} 
  
} 
//This code is contributed by 
// Surendra_Gangwar 

