

import java.util.HashMap; 
  
// Java implementation to find first 
// element occurring k times 
class GFG { 
  
// function to find the first element 
// occurring k number of times 
    static int firstElement(int arr[], int n, int k) { 
        // unordered_map to count 
        // occurrences of each element 
  
        HashMap<Integer, Integer> count_map = new HashMap<>(); 
        for (int i = 0; i < n; i++) { 
            int a = 0; 
            if(count_map.get(arr[i])!=null){ 
                a = count_map.get(arr[i]); 
            } 
              
            count_map.put(arr[i], a+1); 
        } 
        //count_map[arr[i]]++; 
  
        for (int i = 0; i < n; i++) // if count of element == k ,then 
        // it is the required first element  
        { 
            if (count_map.get(arr[i]) == k) { 
                return arr[i]; 
            } 
        } 
  
        // no element occurs k times 
        return -1; 
    } 
  
// Driver program to test above 
    public static void main(String[] args) { 
        int arr[] = {1, 7, 4, 3, 4, 8, 7}; 
        int n = arr.length; 
        int k = 2; 
        System.out.println(firstElement(arr, n, k)); 
    } 
} 
  
//this code contributed by Rajput-Ji 

