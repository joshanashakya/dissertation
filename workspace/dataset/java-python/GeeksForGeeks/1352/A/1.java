

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
static int MAX = 100000; 
  
// Function to print the  
// subsequence elements 
static void print(int g1[], int a,  
                  int g2[], int b) 
{ 
  
    // Prints elements of the 1st subarray 
    for (int i = 0; i < a; i++) 
    { 
        System.out.print(g1[i] + " "); 
    } 
    System.out.print("and "); 
  
    // Prints elements of the 2nd subarray 
    for (int i = 0; i < b; i++)  
    { 
        System.out.print(g2[i] + " "); 
    } 
    System.out.println(); 
} 
  
// Function that returns true if  
// the sum of the elements of  
// arrays g1[] and g2[] is equal 
static boolean checksum(int g1[], int a,  
                        int g2[], int b) 
{ 
    int i, x; 
  
    // Adding elements of the 1st array 
    for (i = 0, x = 0; i < a; i++)  
    { 
        x += g1[i]; 
    } 
  
    // Subtracting elements of  
    // the 2nd array 
    for (i = 0; i < b; i++) 
    { 
        x -= g2[i]; 
    } 
  
    // If x is 0 then the sum of elements 
    // in both the arrays is equal 
    return (x == 0); 
} 
  
// Function to find all valid subsequences 
static void formgroups(int arr[], int x,  
                       int g1[], int a,  
                       int g2[], int b, int n) 
{ 
    // Base Case 
    if (x == n)  
    { 
  
        // If sum of the two subsequences 
        // is equal then print the elements 
        if (checksum(g1, a, g2, b))  
        { 
  
            // Print the subsequences 
            print(g1, a, g2, b); 
        } 
        return; 
    } 
  
    // Recursive Case 
  
    // Choose current element to be a 
    // part of the first subsequence 
    g1[a] = arr[x]; 
    formgroups(arr, x + 1, g1,  
                    a + 1, g2, b, n); 
  
    // Choose current element to be a 
    // part of the second subsequence 
    g2[b] = arr[x]; 
    formgroups(arr, x + 1, g1, a,  
                g2, b + 1, n); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = { 1, 2, 3, 9, 4, 5 }; 
    int n = arr.length; 
  
    int []g1 = new int[MAX]; 
    int []g2 = new int[MAX]; 
    formgroups(arr, 0, g1, 0, g2, 0, n); 
} 
} 
  
// This code is contributed by PrinciRaj1992  

