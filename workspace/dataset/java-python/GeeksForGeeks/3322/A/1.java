

// Java implementation of the above approach 
import java.util.*; 
  
class solution { 
  
    // Function to find the minimum steps 
    // to convert string a to string b 
    static void convert(int n, String a, String b) 
    { 
        // array to mark the positions 
        // needed to be negated 
        int[] l = new int[n]; 
        int i; 
  
        for (i = 0; i < n; i++) 
            l[i] = 0; 
  
        for (i = 0; i < n; i++) { 
  
            // If two character are not same 
            // then they need to be negated 
            if (a.charAt(i) != b.charAt(i)) 
                l[i] = 1; 
        } 
  
        // To count the blocks of 1 
        int cc = 0; 
  
        // To count the number of 1's in 
        // each block of 1's 
        int vl = 0; 
        for (i = 0; i < n; i++) { 
            if (l[i] == 0) { 
                if (vl != 0) 
                    cc += 1; 
  
                vl = 0; 
            } 
            else
                vl += 1; 
        } 
  
        // For the last block of 1's 
        if (vl != 0) 
            cc += 1; 
  
        System.out.println(cc); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        String a = "101010"; 
        String b = "110011"; 
  
        int n = a.length(); 
        convert(n, a, b); 
    } 
} 

