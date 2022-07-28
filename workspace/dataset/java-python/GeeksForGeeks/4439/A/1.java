

// Java Program to find the even occurring 
// elements in given array  
class GFG  
{ 
  
// Function to find the even occurring  
// elements in given array  
static void printRepeatingEven(int arr[], 
                               int n) 
{ 
    long _xor = 0L; 
    long pos; 
  
    // do for each element of array  
    for (int i = 0; i < n; ++i)  
    { 
        // left-shift 1 by value of  
        // current element  
        pos = 1 << arr[i]; 
  
        // Toggle the bit everytime  
        // element gets repeated  
        _xor ^= pos; 
    } 
  
    // Traverse array again and use _xor  
    // to find even occurring elements  
    for (int i = 0; i < n; ++i) 
    { 
        // left-shift 1 by value of  
        // current element  
        pos = 1 << arr[i]; 
  
        // Each 0 in _xor represents 
        // an even occurrence  
        if (!((pos & _xor)!=0))  
        { 
            // print the even occurring numbers  
            System.out.print(arr[i] + " "); 
  
            // set bit as 1 to avoid  
            // printing duplicates  
            _xor ^= pos; 
        } 
    } 
} 
  
// Driver code  
public static void main(String args[])  
{ 
    int arr[] = {9, 12, 23, 10, 12, 12, 
                 15, 23, 14, 12, 15}; 
    int n = arr.length; 
  
    printRepeatingEven(arr, n); 
} 
} 
  
// This code is contributed  
// by 29AjayKumar 

