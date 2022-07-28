

// Java program to check if array has an  
// element whose value is half of array  
// sum.  
  
import java.util.*; 
  
class GFG { 
  
// Function to check if answer exists  
    static boolean checkForElement(int array[], int n) { 
        // Sum of all array elements  
        // and storing in a hash table  
        Set<Integer> s = new LinkedHashSet<>(); 
        int sum = 0; 
        for (int i = 0; i < n; i++) { 
            sum += array[i]; 
            s.add(array[i]); 
        } 
        // If sum/2 is present in hash table  
        if (sum % 2 == 0 && s.contains(sum / 2) 
                && (sum / 2 )== s.stream().skip(s.size() - 1).findFirst().get()) { 
            return true; 
        } else { 
            return false; 
        } 
    } 
  
// Driver code  
    public static void main(String[] args) { 
        int array[] = {1, 2, 3}; 
        int n = array.length; 
        System.out.println(checkForElement(array, n) ? "Yes" : "No"); 
    } 
} 
// This code is contributed by 29AjayKumar 

