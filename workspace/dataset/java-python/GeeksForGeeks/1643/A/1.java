

// Java program find sum of  
// elements that appear k times.  
import java.util.HashMap; 
import java.util.Map; 
  
class GfG 
{ 
  
    // Returns sum of k appearing elements.  
    static int sumKRepeating(int arr[], int n, int k)  
    {  
        int sum = 0;  
          
        // Count frequencies of all items  
        HashMap<Integer, Integer> mp = new HashMap<>();  
        for (int i=0; i<n; i++) 
        {  
            if (!mp.containsKey(arr[i])) 
                mp.put(arr[i], 0); 
            mp.put(arr[i], mp.get(arr[i]) + 1); 
        } 
          
        // Sum items with frequencies equal to k.  
        for (Integer x : mp.keySet())  
            if (mp.get(x) == k)  
                sum += x;  
        return sum;  
    }  
  
    // Driver code 
    public static void main(String []args) 
    { 
          
        int arr[] = { 9, 9, 10, 11, 8, 8, 9, 8 };  
        int n = arr.length;  
        int k = 3;  
  
        System.out.println(sumKRepeating(arr, n, k)); 
    } 
} 
  
// This code is contributed by Rituraj Jain 

