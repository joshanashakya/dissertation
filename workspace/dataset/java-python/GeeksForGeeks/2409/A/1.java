

// Java program to find the maximum element  
// whose frequency equals to it’s value 
import java.util.*; 
  
class GFG{ 
   
// Function to find the maximum element  
// whose frequency equals to it’s value 
static int find_maxm(int arr[], int n) 
{ 
    // Hash map for counting frquency 
    HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>(); 
   
    for (int i = 0; i < n; i++) { 
          
        // Counting freq of each element 
        if(mp.containsKey(arr[i])){ 
            mp.put(arr[i], mp.get(arr[i])+1); 
        }else{ 
            mp.put(arr[i], 1); 
    } 
    } 
   
    int ans = 0; 
    for (Map.Entry<Integer,Integer> x : mp.entrySet()) 
    { 
        int value = x.getKey(); 
        int freq = x.getValue(); 
           
        // Check if value equls to frequency 
        // and it is the maximum element or not 
        if (value == freq) { 
            ans = Math.max(ans, value); 
        } 
    } 
   
    return ans; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 3, 2, 2, 3, 4, 3 }; 
       
    // Size of array 
    int n = arr.length; 
       
    // Function call 
    System.out.print(find_maxm(arr, n)); 
   
} 
} 
  
// This code is contributed by 29AjayKumar 

