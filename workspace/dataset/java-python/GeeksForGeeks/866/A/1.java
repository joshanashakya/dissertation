

// Java program to find the factors 
// of large perfect square number 
// in O(Math.sqrt(Math.sqrt(N))) time 
import java.util.*; 
  
class GFG{ 
   
static int MAX = 100000; 
   
// Function that find all the prime 
// factors of N 
static void findFactors(int N) 
{ 
    // Store the Math.sqrt(N) in temp 
    int temp = (int) Math.sqrt(N); 
   
    // Initialise factor array with 
    // 1 as a factor in it 
    int []factor = new int[MAX]; 
    Arrays.fill(factor, 1); 
    int i, j, k; 
    int len1 = 1; 
   
    // Check divisibility by 2 
    while (temp % 2 == 0) { 
   
        // Store the factors twice 
        factor[len1++] = 2; 
        factor[len1++] = 2; 
   
        temp /= 2; 
    } 
   
    // Check for other prime 
    // factors other than 2 
    for (j = 3; j < Math.sqrt(temp); j += 2) { 
   
        // If j is a prime factor 
        while (temp % j == 0) { 
   
            // Store the prime 
            // factor twice 
            factor[len1++] = j; 
            factor[len1++] = j; 
            temp /= j; 
        } 
    } 
   
    // If j is prime number left 
    // other than 2 
    if (temp > 2) { 
   
        // Store j twice 
        factor[len1++] = temp; 
        factor[len1++] = temp; 
    } 
   
    // Intialise Matrix M to 
    // to store all the factors 
    int [][]M = new int[len1][MAX]; 
   
    // tpc for rows 
    // tpr for column 
    int tpc = 0, tpr = 0; 
   
    // Initialise M[0][0] = 1 as 
    // it also factor of N 
    M[0][0] = 1; 
    j = 1; 
   
    // Traversing factor array 
    while (j < len1) { 
   
        // If current and previous 
        // factors are not same then 
        // move to next row and 
        // insert the current factor 
        if (factor[j] != factor[j - 1]) { 
            tpr++; 
            M[tpr][0] = factor[j]; 
            j++; 
            tpc = 1; 
        } 
   
        // If current and previous 
        // factors are same then, 
        // Insert the factor with 
        // previous factor inserted 
        // in matrix M 
        else { 
            M[tpr][tpc] 
                = M[tpr][tpc - 1] * factor[j]; 
            j++; 
            tpc++; 
        } 
    } 
   
    // The arr1[] and arr2[] used to 
    // store all the factors of N 
    int []arr1 = new int[MAX]; 
    int []arr2 = new int[MAX]; 
    int l1, l2; 
    l1 = l2 = 1; 
   
    // Initialise arrays as 1 
    arr1[0] = arr2[0] = 1; 
   
    // Traversing the matrix M 
    for (i = 1; i < tpr + 1; i++) { 
   
        // Traversing till column 
        // element doesn't become 0 
        for (j = 0; M[i][j] != 0; j++) { 
   
            // Store the product of 
            // every element of current 
            // row with every element 
            // in arr1[] 
            for (k = 0; k < l1; k++) { 
                arr2[l2++] 
                    = arr1[k] * M[i][j]; 
            } 
        } 
   
        // Copying every element of 
        // arr2[] in arr1[] 
        for (j = l1; j < l2; j++) { 
            arr1[j] = arr2[j]; 
        } 
   
        // length of arr2[] and arr1[] 
        // are equal after copying 
        l1 = l2; 
    } 
   
    // Print all the factors 
    for (i = 0; i < l2; i++) { 
        System.out.print(arr2[i] + " "); 
    } 
} 
   
// Drivers Code 
public static void main(String[] args) 
{ 
    int N = 900; 
    findFactors(N); 
} 
} 
  
// This code is contributed by sapnasingh4991 

