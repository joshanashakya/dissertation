

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
    // Function to find the longest subsequence 
    // having LCM less than or equal to K 
    static void findSubsequence(int []arr, int n, int k) 
    { 
      
        // Map to store unique elements 
        // and their frequencies 
        HashMap<Integer, Integer> M = new HashMap<Integer,Integer>(); 
      
        // Update the frequencies 
        for (int i = 0; i < n; ++i) 
        { 
            if(M.containsKey(arr[i])) 
                M.put(arr[i], M.get(arr[i])+1); 
            else
                M.put(arr[i], 1); 
        } 
          
        // Array to store the count of numbers whom 
        // 1 <= X <= K is a multiple of 
        int [] numCount = new int[k + 1]; 
      
        for (int i = 0; i <= k; ++i) 
            numCount[i] = 0; 
      
        Iterator<HashMap.Entry<Integer, Integer>> itr = M.entrySet().iterator();  
          
        // Check every unique element 
        while(itr.hasNext())  
        { 
            HashMap.Entry<Integer, Integer> entry = itr.next(); 
            if (entry.getKey() <= k)  
            { 
      
                // Find all its multiples <= K 
                for (int i = 1;; ++i)  
                { 
                    if (entry.getKey() * i > k) 
                        break; 
      
                    // Store its frequency 
                    numCount[entry.getKey() * i] += entry.getValue(); 
                } 
            } 
            else
                break; 
        } 
      
        int lcm = 0, length = 0; 
      
        // Obtain the number having maximum count 
        for (int i = 1; i <= k; ++i)  
        { 
            if (numCount[i] > length)  
            { 
                length = numCount[i]; 
                lcm = i; 
            } 
        } 
      
        // Condition to check if answer 
        // doesn't exist 
        if (lcm == 0) 
            System.out.println(-1); 
        else
        { 
      
            // Print the answer 
            System.out.println("LCM = " + lcm 
                + " Length = " + length ); 
      
            System.out.print( "Indexes = "); 
            for (int i = 0; i < n; ++i) 
                if (lcm % arr[i] == 0) 
                    System.out.print(i + " "); 
        } 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
      
        int k = 14; 
        int arr[] = { 2, 3, 4, 5 }; 
        int n = arr.length; 
      
        findSubsequence(arr, n, k); 
    } 
} 
  
// This code is contributed by ihritik 

