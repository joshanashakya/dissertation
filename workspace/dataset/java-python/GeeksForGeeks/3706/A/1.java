

// Java implementation of the approach 
import java.util.HashMap;  
  
class GFG 
{ 
      
    // Function to return the count  
    // of all valid pairs  
    static int countPairs(int arr[], int n)  
    {  
      
        // To store the frequencies  
        // of (arr[i] - i)  
        HashMap<Integer,  
                Integer> map = new HashMap<Integer,  
                                           Integer>();  
        for (int i = 0; i < n; i++)  
            map.put(arr[i] - i, 0);  
          
        for (int i = 0; i < n; i++)  
            map.put(arr[i] - i, map.get(arr[i] - i) + 1);  
      
        // To store the required count  
        int res = 0;  
        for (int x : map.values()) 
        { 
            int cnt = x;  
      
            // If cnt is the number of elements  
            // whose differecne with their index  
            // is same then ((cnt * (cnt - 1)) / 2)  
            // such pairs are possible  
            res += ((cnt * (cnt - 1)) / 2);  
        }  
      
        return res;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int arr[] = { 1, 5, 6, 7, 9 };  
        int n = arr.length; 
      
        System.out.println(countPairs(arr, n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

