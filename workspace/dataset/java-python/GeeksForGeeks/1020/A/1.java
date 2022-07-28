

// Java implementation of the approach 
  
class GFG 
{ 
      
// Function to sort the array 
// by removing misplaced elements 
static void removeElements(int []arr, int n) 
{ 
  
    // brr[] is used to store 
    // the sorted array elements 
    int []brr = new int[n]; 
    int l = 1; 
  
    brr[0] = arr[0]; 
    for (int i = 1; i < n; i++) 
    { 
        if (brr[l - 1] <= arr[i])  
        { 
            brr[l] = arr[i]; 
            l++; 
        } 
    } 
  
    // Print the sorted array 
    for (int i = 0; i < l; i++) 
        System.out.print(brr[i] + " "); 
} 
  
// Driver code 
static public void main (String[] args) 
{ 
    int []arr = { 10, 12, 9, 10, 2, 13, 14 }; 
    int n = arr.length; 
    removeElements(arr, n); 
} 
} 
  
// This code is contributed by Code_Mech. 

