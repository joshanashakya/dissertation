

// Java implementation to find if it's 
// possible to make all elements of an 
// array equal by using two operations. 
class GFG{ 
   
// Function to find if it's possible 
// to make all array elements equal 
static boolean canMakeEqual(int a[], int n) 
{ 
    // Iterate over all numbers 
    for (int i = 0; i < n; i++) { 
   
        // If a number has a power of 5 
        // remove it 
        while (a[i] % 5 == 0) { 
            a[i] /= 5; 
        } 
   
        // If a number has a power of 3 
        // remove it 
        while (a[i] % 3 == 0) { 
            a[i] /= 3; 
        } 
    } 
   
    int last = a[0]; 
   
    // Check if all elements are equal 
    // in the final array 
    for (int i = 1; i < n; i++) { 
        if (a[i] != last) { 
            return false; 
        } 
    } 
   
    return true; 
} 
   
// Driver's Code 
public static void main(String[] args) 
{ 
    int arr[] = { 18, 30, 54, 90, 162 }; 
   
    int n = arr.length; 
   
    // Function call to check if all 
    // element in the array can be equal 
    // or not. 
    if (canMakeEqual(arr, n)) { 
        System.out.print("YES" +"\n"); 
    } 
    else { 
        System.out.print("NO" +"\n"); 
    }  
} 
} 
  
// This code is contributed by PrinciRaj1992 

