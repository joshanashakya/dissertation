

// Java implementation to count the 
// number of contiguous subsequences 
// whose product can be expressed as 
// the square of difference of two integers 
  
class GFG{ 
   
// Function to count the number 
// of contiguous subsequences 
// whose product can be expressed 
// as square of difference of two integers 
static int CntcontSubs(int a[], int n) 
{ 
    int c = 0, d = 0, i, sum = 1, j; 
   
    // Iterating through the array 
    for (i = 0; i < n; i++) { 
   
        // Check if that number can be 
        // expressed as the square of 
        // difference of two numbers 
        if (a[i] % 2 != 0 || a[i] % 4 == 0) 
            d++; 
   
        // Variable to compute the product 
        sum = a[i]; 
   
        // Finding the remaining subsequences 
        for (j = i + 1; j < n; j++) { 
            sum = sum * a[j]; 
   
            // Check if that number can be 
            // expressed as the square of 
            // difference of two numbers 
            if (sum % 2 != 0 || sum % 4 == 0) 
                c++; 
        } 
        sum = 1; 
    } 
   
    // Return the number of subsequences 
    return c + d; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 5, 4, 2, 9, 8 }; 
    int n = arr.length; 
   
    System.out.print(CntcontSubs(arr, n)); 
   
} 
} 
  
// This code contributed by PrinciRaj1992 

