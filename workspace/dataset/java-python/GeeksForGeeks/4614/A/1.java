

// Java program to count number of visible 
// boxes. 
  
import java.util.LinkedList; 
import java.util.Queue; 
import java.util.Arrays; 
  
public class GFG { 
      
    // return the minimum number of visible 
    // boxes 
    static int minimumBox(int []arr, int n) 
    { 
          
        // New Queue of integers. 
        Queue<Integer> q = new LinkedList<>(); 
      
        // sorting the array 
        Arrays.sort(arr); 
      
        q.add(arr[0]); 
          
        // traversing the array 
        for (int i = 1; i < n; i++) 
        { 
            int now = q.element(); 
      
            // checking if current element 
            // is greater than or equal to 
            // twice of front element 
            if (arr[i] >= 2 * now) 
            q.remove(); 
      
            // Pushing each element of array 
            q.add(arr[i]); 
        } 
      
        return q.size(); 
    }  
      
    // Driver code 
    public static void main(String args[])  
    { 
        int [] arr = { 4, 1, 2, 8 }; 
        int n = arr.length; 
          
        System.out.println(minimumBox(arr, n)); 
    } 
} 
  
// This code is contributed by Sam007. 

