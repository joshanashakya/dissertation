

// Java  program to Replace every element  
// by the bitwise xor of all other elements  
  
import java.io.*; 
  
class GFG { 
      
// Function to replace the elements  
static void ReplaceElements(int arr[], int n)  
{  
    int X = 0;  
  
    // Calculate the xor of all the elements  
    for (int i = 0; i < n; ++i) {  
        X ^= arr[i];  
    }  
  
    // Replace every element by the  
    // xor of all other elements  
    for (int i = 0; i < n; ++i) {  
        arr[i] = X ^ arr[i];  
    }  
}  
  
// Driver code  
 public static void main (String[] args) { 
  
    int arr[] = { 2, 3, 3, 5, 5 };  
    int n = arr.length;  
  
    ReplaceElements(arr, n);  
  
    // Print the modified array.  
    for (int i = 0; i < n; ++i) {  
        System.out.print(arr[i] +" "); 
          
        } 
    } 
} 

