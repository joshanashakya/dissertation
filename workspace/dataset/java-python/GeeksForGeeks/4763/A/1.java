

// Java implementation to find the 
// Array from the XOR array 
// of the adjacent elements of array 
import java.util.*; 
  
class GFG{ 
  
// XOR of all elements from 1 to N 
static int xor_all_elements(int n) 
{ 
  
    switch (n & 3) { 
  
    case 0: 
        return n; 
    case 1: 
        return 1; 
    case 2: 
        return n + 1;  
    } 
    return 0; 
} 
  
// Function to find the Array 
// from the XOR Array 
static Vector<Integer> findArray(int xorr[], int n) 
{ 
    // Take a vector to store 
    // the permuatation 
    Vector<Integer> arr = new Vector<Integer>(); 
  
    // XOR of N natural numbers 
    int xor_all = xor_all_elements(n); 
    int xor_adjacent = 0; 
  
    // Loop to find the XOR of 
    // adjacent elements of the XOR Array 
    for (int i = 0; i < n - 1; i += 2) { 
        xor_adjacent = xor_adjacent ^ xorr[i]; 
    } 
    int last_element = xor_all ^ xor_adjacent; 
    arr.add(last_element); 
  
    // Loop to find the other 
    // elements of the permuatation 
    for (int i = n - 2; i >= 0; i--) 
    { 
        // Finding the next and next elements 
        last_element = xorr[i] ^ last_element; 
        arr.add(last_element); 
    } 
  
    return arr; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    Vector<Integer> arr = new Vector<Integer>(); 
  
    int xorr[] = { 7, 5, 3, 7 }; 
    int n = 5; 
  
    arr = findArray(xorr, n); 
  
    // Required Permutation 
    for (int i = n - 1; i >= 0; i--)  
    { 
        System.out.print(arr.get(i)+ " "); 
    } 
} 
} 
  
// This code is contributed by PrinciRaj1992 

