

// Java program to find the sum 
// of all palindrome numbers 
// in the given range 
import java.util.*; 
  
class GFG{ 
   
// pref[] array to precompute 
// the sum of all palindromic 
// number 
static int []pref = new int[100001]; 
   
// Function that return number 
// num if num is palindromic 
// else return 0 
static int checkPalindrome(int num) 
{ 
   
    // Convert num to String 
    String str = String.valueOf(num); 
   
    int l = 0, r = str.length() - 1; 
   
    while (l < r) { 
        if (str.charAt(l) != str.charAt(r)) { 
            return 0; 
        } 
        l++; 
        r--; 
    } 
    return num; 
} 
   
// Function to precompute the 
// sum of all palindrome numbers 
// upto 100000 
static void preCompute() 
{ 
    for (int i = 1; i <= 100000; ++i) { 
   
        // checkPalindrome() 
        // return the number i 
        // if i is palindromic 
        // else return 0 
        pref[i] = pref[i - 1] 
                  + checkPalindrome(i); 
    } 
} 
   
// Function to print the sum 
// for each query 
static void printSum(int L, int R) 
{ 
    System.out.print(pref[R] - pref[L - 1] 
         +"\n"); 
} 
   
// Function to print sum of all 
// palindromic numbers between 
// [L, R] 
static void printSumPalindromic(int arr[][], 
                         int Q) 
{ 
   
    // Function that pre computes 
    // the sum of all palindromic 
    // numbers 
    preCompute(); 
   
    // Iterate over all Queries 
    // to print the sum 
    for (int i = 0; i < Q; i++) { 
        printSum(arr[i][0], arr[i][1]); 
    } 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    // Queries 
    int Q = 2; 
    int arr[][] = { { 10, 13 }, 
                     { 12, 21 } }; 
   
    // Function that print the 
    // the sum of all palindromic 
    // number in Range [L, R] 
    printSumPalindromic(arr, Q); 
} 
} 
  
// This code is contributed by 29AjayKumar 

