

// Java implementation of the approach 
import java.util.HashMap; 
import java.util.Map; 
  
class GfG 
{ 
  
    // Function to return the count of valid pairs  
    static int count_pairs(int n, int a[])  
    {  
        // Store frequencies of array elements  
        HashMap<Integer, Integer> frequency = new HashMap<>();  
        for (int i = 0; i < n; i++) 
        {  
              
            if (!frequency.containsKey(a[i])) 
                frequency.put(a[i], 0); 
            frequency.put(a[i], frequency.get(a[i])+1);  
        }  
      
        int count = 0;  
      
        // Count of pairs (arr[i], arr[j])  
        // where arr[i] = arr[j]  
        for (Map.Entry<Integer, Integer> x: frequency.entrySet()) 
        {  
            int f = x.getValue();  
            count += f * (f - 1) / 2;  
        }  
      
        // Count of pairs (arr[i], arr[j]) where  
        // arr[i] != arr[j], i.e. Total pairs - pairs  
        // where arr[i] = arr[j]  
        return ((n * (n - 1)) / 2) - count;  
    } 
  
    // Driver code 
    public static void main(String []args) 
    { 
          
        int arr[] = { 2, 4, 5, 2, 5, 7, 2, 8 };  
        int n = arr.length;  
        System.out.println(count_pairs(n, arr)); 
    } 
} 
      
// This code is contributed by Rituraj Jain 

