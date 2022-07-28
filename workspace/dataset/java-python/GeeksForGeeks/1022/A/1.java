

// Count minimum changes to  
// make array from 1 to n  
import java.util.Set; 
import java.util.HashSet; 
  
class GfG 
{ 
      
    static int countChanges(int arr[], int n)  
    {  
        // It will contain all initial elements  
        // of array for log(n) complexity searching  
        Set<Integer> s = new HashSet<>();  
      
        // Inserting all elements in a hash table  
        for (int i = 0; i < n; i++)  
            s.add(arr[i]);  
          
        // Finding elements to be changed  
        int count = 0;  
        for (int i = 1; i <= n; i++)  
            if (!s.contains(i))  
                count++;  
      
        return count;  
    }  
  
    // Driver code 
    public static void main(String []args) 
    { 
          
        int arr[] = {8, 55, 22, 1, 3, 22, 4, 5};  
        int n = arr.length;  
  
        System.out.println(countChanges(arr, n)); 
    } 
} 
  
// This code is contributed by Rituraj Jain 

