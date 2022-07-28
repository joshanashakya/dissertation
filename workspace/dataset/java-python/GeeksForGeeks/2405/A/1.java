

// Java implementation of above approach  
import java.util.HashMap; 
import java.util.Map; 
  
class GfG 
{ 
  
    // Function that finds the largest  
    // element that occurs exactly 'k' times  
    static void solve(int arr[], int n, int k)  
    {  
        // store the frequency of each element  
        HashMap<Integer, Integer> m = new HashMap<>();  
        for (int i = 0; i < n; i++) 
        {  
            if (!m.containsKey(arr[i])) 
                m.put(arr[i], 0); 
            m.put(arr[i], m.get(arr[i]) + 1); 
        }  
      
        // to store the maximum element  
        int max = Integer.MIN_VALUE;  
      
        for (int i = 0; i < n; i++) 
        {  
      
            // If current element has frequency 'k'  
            // and current maximum hasn't been set  
            if (m.get(arr[i]) == k && max == Integer.MIN_VALUE)  
            {  
      
                // set the current maximum  
                max = arr[i];  
            }  
      
            // if current element has  
            // frequency 'k' and it is  
            // greater than the current maximum  
            else if (m.get(arr[i]) == k && max < arr[i]) 
            {  
      
                // change the current maximum  
                max = arr[i];  
            }  
        }  
      
        // if there is no element  
        // with frequency 'k'  
        if (max == Integer.MIN_VALUE)  
            System.out.println("No such element");  
      
        // print the largest element  
        // with frequency 'k'  
        else
            System.out.println(max);  
    }  
  
    // Driver code 
    public static void main(String []args) 
    { 
          
        int arr[] = { 1, 1, 2, 3, 3, 4, 5, 5, 6, 6, 6 };  
        int k = 4;  
        int n = arr.length;  
      
        // find the largest element  
        // that is repeated K times  
        solve(arr, n, k);  
    } 
} 
  
// This code is contributed by Rituraj Jain 

