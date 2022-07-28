

// Java  program to find the array elements 
// using XOR of consecutive elements 
  
import java.io.*; 
  
class GFG { 
     
  
// Function to find the array elements 
// using XOR of consecutive elements 
static void getElements(int a, int arr[], int n) 
{ 
    // array to store the orginal 
    // elements 
    int elements[] = new int[n + 1]; 
  
    // first element a i.e elements[0]=a 
    elements[0] = a; 
  
    for (int i = 0; i < n; i++) { 
  
        /* To get the next elements we have to calculate  
            xor of previous elements with given xor of 2  
            consecutive elements. 
            e.g. if a^b=k1 so to get b xor a both side. 
            b = k1^a  
        */
        elements[i + 1] = arr[i] ^ elements[i]; 
    } 
  
    // Printing the original array elements 
    for (int i = 0; i < n + 1; i++) 
        System.out.print( elements[i] + " "); 
} 
  
// Driver Code 
  
    public static void main (String[] args) { 
            int arr[] = { 13, 2, 6, 1 }; 
  
    int n = arr.length; 
  
    int a = 5; 
  
    getElements(a, arr, n); 
    } 
} 
// This code is contributed by anuj_67.. 

