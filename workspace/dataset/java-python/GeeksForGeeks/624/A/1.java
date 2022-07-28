

// Java program to find sum of bitwise AND 
// of all subarrays 
class GFG 
{ 
      
// Function to find the sum of 
// bitwise AND of all subarrays 
static int findAndSum(int []arr, int n) 
{ 
    // variable to store 
    // the final sum 
    int sum = 0; 
  
    // multiplier 
    int mul = 1; 
  
    for (int i = 0; i < 30; i++)  
    { 
        // variable to check if 
        // counting is on 
        boolean count_on = false; 
  
        // variable to store the 
        // length of the subarrays 
        int l = 0; 
  
        // loop to find the contiguous 
        // segments 
        for (int j = 0; j < n; j++)  
        { 
            if ((arr[j] & (1 << i)) > 0) 
                if (count_on) 
                    l++; 
                else
                { 
                    count_on = true; 
                    l++; 
                } 
  
            else if (count_on) 
            { 
                sum += ((mul * l * (l + 1)) / 2); 
                count_on = false; 
                l = 0; 
            } 
        } 
  
        if (count_on)  
        { 
            sum += ((mul * l * (l + 1)) / 2); 
            count_on = false; 
            l = 0; 
        } 
  
        // updating the multiplier 
        mul *= 2; 
    } 
  
    // returning the sum 
    return sum; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int []arr = { 7, 1, 1, 5 }; 
    int n = arr.length; 
  
    System.out.println(findAndSum(arr, n)); 
} 
} 
  
// This code is contributed  
// by Code_Mech. 

