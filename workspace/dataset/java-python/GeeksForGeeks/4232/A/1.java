

//Java  implementation of the approach/ 
  
import java.io.*; 
  
class GFG { 
      
// Function to print the maximum length sub-sequence 
static void maxLengthSubSeq(int a[], int n) 
{ 
    // Arrays to store the values to be printed 
    int temp[]=new int[n]; 
    int print[]=new int[n]; 
    int y = 0; 
  
    for (int i = 0; i < n; i++) { 
        int j = 0; 
        int x = 0; 
  
        // Store the first value into the temp array 
        temp[j++] = a[x]; 
  
        // Index of the next element 
        x = a[x] + x; 
  
        // Iterate till index is in range of the array 
        while (x < n) { 
            temp[j++] = a[x]; 
            x = a[x] + x; 
        } 
  
        // If the length (temp) > the length (print) then 
        // copy the contents of the temp array into 
        // the print array 
        if (y < j) { 
            for (int k = 0; k < j; k++) { 
                print[k] = temp[k]; 
                y = j; 
            } 
        } 
    } 
  
    // Print the contents of the array 
    for (int i = 0; i < y; i++) 
            System.out.print(print[i] + " "); 
} 
  
// Driver code 
    public static void main (String[] args) { 
  
    int a[] = { 1, 2, 3, 4, 5 }; 
    int n = a.length; 
    maxLengthSubSeq(a, n); 
    } 
//This code is contributed by @Tushil.     
} 

