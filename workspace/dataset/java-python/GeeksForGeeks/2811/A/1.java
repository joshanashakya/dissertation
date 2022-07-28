

// Java implementation to reverse 
// the subStrings of the given String 
// according to the given Array of indices 
class GFG 
{ 
  
static String s; 
  
// Function to reverse a String 
static void reverseStr(int l, int h) 
{ 
    int n = h - l; 
  
    // Swap character starting 
    // from two corners 
    for (int i = 0; i < n / 2; i++)  
    { 
        s = swap(i + l, n - i - 1 + l); 
    } 
} 
  
// Function to reverse the String 
// with the given array of indices 
static void reverseString(int A[], int n) 
{ 
  
    // Reverse the String from 0 to A[0] 
    reverseStr(0, A[0]); 
  
    // Reverse the String for A[i] to A[i+1] 
    for (int i = 1; i < n; i++) 
        reverseStr(A[i - 1], A[i]); 
  
    // Reverse String for A[n-1] to length 
    reverseStr(A[n - 1], s.length()); 
} 
static String swap(int i, int j)  
{  
    char ch[] = s.toCharArray();  
    char temp = ch[i];  
    ch[i] = ch[j];  
    ch[j] = temp;  
    return String.valueOf(ch);  
}  
  
// Driver Code 
public static void main(String[] args) 
{ 
    s = "abcdefgh"; 
    int A[] = { 2, 4, 6 }; 
    int n = A.length; 
  
    reverseString(A, n); 
    System.out.print(s); 
} 
} 
  
// This code is contributed by Rajput-Ji 

