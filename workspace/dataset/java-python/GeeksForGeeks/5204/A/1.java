

// Java implementation of the above approach 
import java.util.Arrays; 
class GFG  
{ 
  
    // Function to check if both  
    // sequences can be made equal  
    static boolean check(int n, int k,  
                        int[] a, int[] b)  
    { 
  
        // Sorting both the arrays  
        Arrays.sort(a); 
        Arrays.sort(b); 
  
        // Flag to tell if there are  
        // more than one mismatch  
        boolean fl = false; 
  
        // To stores the index  
        // of mismatched element  
        int ind = -1; 
        for (int i = 0; i < n; i++)  
        { 
            if (a[i] != b[i]) 
            { 
  
                // If there is more than one  
                // mismatch then return False  
                if (fl == true)  
                { 
                    return false; 
                } 
                fl = true; 
                ind = i; 
            } 
        } 
          
        // If there is no mismatch or the  
        // difference between the  
        // mismatching elements is <= k  
        // then return true  
        if (ind == -1 | Math.abs(a[ind] - b[ind]) <= k) 
        { 
            return true; 
        } 
        return false; 
  
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 2, k = 4; 
        int[] a = {1, 5}; 
        int b[] = {1, 1}; 
        if (check(n, k, a, b))  
        { 
            System.out.println("Yes"); 
        } 
        else 
        { 
            System.out.println("No"); 
        } 
    } 
}  
  
// This code is contributed by 29AjayKumar 

