

// Java implementation of  
// the above approach 
import java.util.Arrays;  
import java.io.*; 
  
class GFG { 
  
// Function to count the  
// total number of items  
static int items(int n, int a[]){  
  
    // Sort the prices  
    Arrays.sort(a); 
  
    // Choose the last element  
    int z = a[n-1];  
  
    // Initial count of item  
    int x = 1; 
  
    // Sum to keep track of  
    // the total price  
    // of free items  
    int s = 0; 
    for (int i=0;i<n-1;i++)  
    { 
        s += a[i];  
  
        // If total is less than  
        // or equal to z then  
        // we will add 1 to the answer  
        if (s <= z)  
            x+= 1; 
        else
            break; 
    } 
    return x; 
} 
        // Driver code 
    public static void main (String[] args) { 
  
        int n = 5; 
        int a[]= {5, 3, 1, 5, 6}; 
        System.out.println(items(n, a));  
    } 
//This code is contributed by ajit     
} 

