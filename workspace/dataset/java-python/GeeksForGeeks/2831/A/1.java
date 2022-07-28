

// Java implementation to find maximum length 
// subsequence with difference between adjacent  
// elements as either 0 or 1 
import java.util.HashMap; 
  
class GFG 
{ 
      
    // function to find maximum length subsequence  
    // with difference between adjacent elements as 
    // either 0 or 1 
    public static int maxLengthSub(int[] arr) 
    { 
          
        // to store the maximum length subsequence 
        int max_val = 0; 
        int start = 0; 
          
        // hash table to map the array element with the 
        // length of the longest subsequence of which 
        // it is a part of and is the last element of 
        // that subsequence 
        HashMap<Integer, Integer> map = new HashMap<>(); 
  
        // traverse the array elements 
        for (int i = 0; i < arr.length; i++)  
        { 
              
            // initialize current length  
            // for element arr[i] as 0 
            int temp = 0; 
            if (map.containsKey(arr[i] - 1)) 
            { 
                temp = map.get(arr[i] - 1); 
            } 
  
            if (map.containsKey(arr[i])) 
            { 
                temp = Math.max(temp, map.get(arr[i])); 
            } 
              
            if (map.containsKey(arr[i] + 1)) 
            { 
                temp = Math.max(temp, map.get(arr[i] + 1)); 
            } 
            temp++; 
              
            // update maximum length 
            if (temp > max_val)  
            { 
                max_val = temp; 
            } 
            map.put(arr[i], temp); 
        } 
          
        // required maximum length subsequence 
        return max_val; 
    } 
      
    // Driver Code 
    public static void main(String[] args) 
    { 
        int arr[] = {2, 5, 6, 3, 7, 6, 5, 8}; 
        System.out.println(maxLengthSub(arr)); 
    } 
} 
  
// This code is contributed  
// by tushar jajodia 

