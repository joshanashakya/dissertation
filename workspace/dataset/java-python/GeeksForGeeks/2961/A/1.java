

// Java Program to count number of subarrays  
// with Bitwise-XOR as power of 2 
import java.util.*; 
  
class GFG 
{ 
  
static int MAX = 10; 
  
// Function to find number of subarrays 
static int findSubarray(int array[], int n) 
{ 
    // Hash Map to store prefix XOR values 
    HashMap<Integer, 
            Integer> mp = new HashMap<Integer, 
                                      Integer>(); 
  
    // When no element is selected 
    mp.put(0, 1); 
  
    int answer = 0; 
    int preXor = 0; 
    for (int i = 0; i < n; i++)  
    { 
        int value = 1; 
        preXor ^= array[i]; 
  
        // Check for all the powers of 2,  
        // till a MAX value 
        for (int j = 1; j <= MAX; j++)  
        { 
            int Y = value ^ preXor; 
            if (mp.containsKey(Y))  
            { 
                answer += mp.get(Y); 
            } 
            value *= 2; 
        } 
  
        // Insert Current prefixxor in Hash Map 
        if (mp.containsKey(preXor))  
        { 
            mp.put(preXor,mp.get(preXor) + 1); 
        } 
        else 
        { 
            mp.put(preXor, 1); 
        } 
    } 
    return answer; 
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
    int array[] = { 2, 6, 7, 5, 8 }; 
      
    int n = array.length; 
      
    System.out.println(findSubarray(array, n)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

