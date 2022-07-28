

// Java program to find Minimum number 
// of operations to convert an array  
// so that arr[i] % 4 is zero. 
  
class GFG { 
   
// Function to find minimum operations. 
static int minimumOperations(int arr[], int n) 
{    
  
    // Counting of all the elements 
    // leaving remainder 1, 2, 3 when 
    // divided by 4 in the array brr. 
    // at positions 1, 2 and 3 respectively. 
    int brr[] = { 0, 0, 0, 0 }; 
    for (int i = 0; i < n; i++) 
        brr[arr[i] % 4]++; 
   
    // If it is possible to convert the  
    // array so that arr[i] % 4 is zero. 
    if ((brr[1] + 2 * brr[2] + 3 * brr[3]) % 4 == 0)  
    { 
        // Pairing the elements of brr3 and brr1. 
        int min_opr = Math.min(brr[3], brr[1]); 
        brr[3] -= min_opr; 
        brr[1] -= min_opr; 
   
        // Pairing the brr2 elements. 
        min_opr += brr[2] / 2; 
   
        // Assigning the remaining brr2 elements. 
        brr[2] %= 2; 
   
        // If we are left with one brr2 element. 
        if (brr[2] == 1) { 
   
            // Here we need only two operations 
            // to convert the remaining one 
            // brr2 element to convert it. 
            min_opr += 2; 
   
            // Now there is no brr2 element. 
            brr[2] = 0; 
   
            // Remaining brr3 elements. 
            if (brr[3] == 1)              
                brr[3] -= 2;             
   
            // Remaining brr1 elements. 
            if (brr[1]== 1)  
                brr[1] -= 2;             
        } 
   
        // If we are left with brr1 and brr2 
        // elements then, we have to take four 
        // of them and fixing them all together 
        // in 3 operations. 
        if (brr[1] == 1)         
            min_opr += (brr[1] / 4) * 3;         
        if (brr[3] == 1)         
            min_opr += (brr[3] / 4) * 3;         
   
        // Returns the minimum operations. 
        return min_opr; 
    } 
   
    // If it is not possible to convert the array. 
    return -1;     
} 
   
// Driver function 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 2, 3, 1, 2, 3, 8 }; 
    int n = arr.length; 
    System.out.println(minimumOperations(arr, n)); 
} 
} 
  
// This code is contributed by Prerna Saini. 

