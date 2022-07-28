

// Java program to print the array 
// removing the leading zeros 
import java.util.*; 
  
class solution 
{ 
  
// Function to print the array by 
// removing leading zeros 
static void removeZeros(int[] a, int n) 
{ 
  
    // index to store the first 
    // non-zero number 
    int ind = -1; 
  
    // traverse in the array and find the first 
    // non-zero number 
    for (int i = 0; i < n; i++) { 
        if (a[i] != 0) { 
            ind = i; 
            break; 
        } 
    } 
  
    // if no non-zero number is there 
    if (ind == -1) { 
        System.out.print("Array has leading zeros only"); 
        return; 
    } 
  
    // Create an array to store 
    // numbers apart from leading zeros 
    int[] b = new int[n - ind]; 
  
    // store the numbers removing leading zeros 
    for (int i = 0; i < n - ind; i++) 
        b[i] = a[ind + i]; 
  
    // print the array 
    for (int i = 0; i < n - ind; i++) 
        System.out.print(b[i]+" "); 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int[] a = { 0, 0, 0, 1, 2, 0, 3 }; 
    int n = a.length; 
    removeZeros(a, n); 
      
} 
} 

