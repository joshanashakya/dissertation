

// JAVA code to find the first element 
// that appears even number times 
import java.util.*; 
class GFG { 
    public static int firstEven(int arr[], int n) 
    { 
  
        HashMap<Integer, Boolean> map =  
                 new HashMap<Integer, Boolean>(); 
  
        for (int i = 0; i < n; i++) { 
  
            // first time occurred 
            if (map.get(arr[i]) == null)  
                map.put(arr[i], false); 
              
            // toggle for repeated occurrence 
            else { 
                boolean val = map.get(arr[i]); 
                if (val == true) 
                    map.put(arr[i], false); 
                else
                    map.put(arr[i], true); 
            } 
        } 
  
        int j = 0; 
        for (j = 0; j < n; j++) { 
  
            // first integer with true value 
            if (map.get(arr[j]) == true) 
                break; 
        } 
  
        return arr[j]; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 2, 4, 6, 8, 1, 6 }; 
        int n = arr.length; 
        System.out.println(firstEven(arr, n)); 
    } 
} 

