

// Java implementation of above approach 
  
import java.io.*; 
  
class GFG { 
  
// Recursive function that returns 1 if 
// palindrome, 0 if not palindrome 
static int palindrome(int arr[], int begin, int end) 
{ 
    // base case 
    if (begin >= end) { 
        return 1; 
    } 
    if (arr[begin] == arr[end]) { 
        return palindrome(arr, begin + 1, end - 1); 
    } 
    else { 
        return 0; 
    } 
} 
  
// Driver code 
    public static void main (String[] args) { 
    int a[] = { 3, 6, 0, 6, 3 }; 
    int n = a.length; 
  
    if (palindrome(a, 0, n - 1) == 1) 
        System.out.print( "Palindrome"); 
    else
        System.out.println( "Not Palindrome"); 
    } 
} 

