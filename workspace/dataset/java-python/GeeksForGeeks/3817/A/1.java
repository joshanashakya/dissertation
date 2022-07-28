

// Java program to sort an array where 
// a subarray of a sorted array 
// is in reversed order 
import java.io.*; 
  
class GFG 
{ 
  
// Function to print the sorted array 
// by reversing the subarray 
static void printSorted(int a[], int n) 
{ 
    int front = -1, back = -1; 
  
    // find the starting index of the 
    // reversed subarry 
    for (int i = 1; i < n; i++) 
    { 
        if (a[i] < a[i - 1])  
        { 
            front = i - 1; 
            break; 
        } 
    } 
  
    // find the ending index of the 
    // reversed subarray 
    for (int i = n - 2; i >= 0; i--)  
    { 
        if (a[i] > a[i + 1])  
        { 
            back = i + 1; 
            break; 
        } 
    } 
  
    // if no reversed subarray is present 
    if (front == -1 && back == -1)  
    { 
        for (int i = 0; i < n; i++) 
            System.out.println(a[i] + " "); 
        return; 
    } 
  
    // swap the reversed subarray 
    while (front <= back) 
    { 
  
        // swaps the front and back element 
        // using c++ STL 
        int temp = a[front]; 
        a[front] = a[back]; 
        a[back] = temp; 
  
        // move the pointers one step 
        // ahead and one step back 
        front++; 
        back--; 
    } 
    for (int i = 0; i < n; i++) 
        System.out.print(a[i] + " "); 
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
    int a[] = { 1, 7, 6, 5, 4, 3, 2, 8 }; 
    int n = a.length; 
    printSorted(a, n);; 
} 
} 
  
// This code is contributed by anuj_67.. 

