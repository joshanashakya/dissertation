

class GFG{ 
   
// Function to find the count of numbers 
// which are multiple of its set bits count 
static int find_count(int []arr) 
{ 
    // variable to store count 
    int ans = 0; 
   
    // iterate over elements of array 
    for (int i : arr) { 
   
        // Get the set-bits count of each element 
        int x = Integer.bitCount(i); 
   
        // Check if the setbits count 
        // divides the integer i 
        if (i % x == 0) 
   
            // Increment the count 
            // of required numbers by 1 
            ans += 1; 
    } 
   
    return ans; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int []arr 
        = { 1, 2, 3, 4, 5, 6 }; 
   
    System.out.print(find_count(arr)); 
   
} 
} 
  
// This code contributed by Princi Singh 

