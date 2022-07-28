

// Java implementation to find the 
// element whose frequency is equal  
// to the sum of frequencies of  
// other elements of the array 
import java.util.*; 
  
class GFG{ 
   
// Function to check that any element  
// have frequency equal to the sum of  
// frequency of other elements of the array 
static boolean isFrequencyEqual(int arr[], int len) 
{ 
    // Check that if the array length 
    // is odd, Then no solution possible 
    if (len % 2 == 1){ 
        System.out.print("No Such Element"); 
        return false; 
    } 
   
    // Hash-map to store the frequency 
    // of elements of array 
    HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>(); 
       
    // Loop to find the frequency  
    // of elements of array 
    for (int i = 0; i < len; i++) 
        if(freq.containsKey(arr[i])){ 
            freq.put(arr[i], freq.get(arr[i])+1); 
        } 
        else{ 
            freq.put(arr[i], 1); 
        } 
           
    // Loop to check if any element  
    // of the array have frequency  
    // equal to the half length 
    for (int i = 0; i < len; i++){ 
        if (freq.containsKey(arr[i]) && freq.get(arr[i]) == len / 2){ 
            System.out.print(arr[i] +"\n"); 
            return true; 
        } 
    } 
           
    System.out.print("No such element"); 
    return false; 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 2, 2, 3, 3, 3 }; 
    int n = 6; 
       
    // Function Call 
    isFrequencyEqual(arr, n); 
} 
} 
  
// This code is contributed by Rajput-Ji 

