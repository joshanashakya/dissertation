

import java.util.*; 
  
class GFG { 
      
    /* Function to get no of set   
    bits in binary representation   
    of passed binary no. */
    static int countSetBits(int n)  
    {  
        int count = 0;  
        while (n > 0)  
        {  
            n &= (n - 1) ;  
            count++;  
        }  
        return count;  
    }  
      
    // Function to count all pairs 
    // with equal set bits count 
    static int totalPairs(int arr[], int n) 
    { 
        // map to store count of elements 
        // with equal number of set bits 
        HashMap<Integer, Integer> m = new HashMap<>(); 
        for (int i = 0; i < n; i++) { 
      
            // function that returns the 
            // count of set bits of the number 
            int count = countSetBits(arr[i]); 
            if(m.containsKey(count)) 
                m.put(count, m.get(count) + 1); 
            else
                m.put(count, 1); 
        } 
      
        int result = 0; 
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) { 
            int value = entry.getValue(); 
              
            // there can be (n*(n-1)/2) unique two- 
            // element pairs to choose from n elements 
            result += ((value * (value -1)) / 2); 
        } 
      
        return result; 
    } 
      
    public static void main (String[] args) { 
        int arr[] = { 7, 5, 3, 9, 1, 2 }; 
        int n = arr.length; 
        System.out.println(totalPairs(arr, n)); 
    } 
} 

