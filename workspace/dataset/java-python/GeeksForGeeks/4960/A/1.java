

// Java program to check if we can make 
// neighbors distinct. 
import java.io.*; 
import java.util.HashMap; 
import java.util.Map; 
class GFG { 
      
    static void distinctAdjacentElement(int a[], int n) 
    { 
        // map used to count the frequency 
        // of each element occurring in the 
        // array 
        HashMap<Integer,Integer> m = new HashMap<Integer, 
                                             Integer>(); 
       
        // In this loop we count the frequency 
        // of element through map m . 
        for (int i = 0; i < n; ++i){ 
     
            // checks if map already contains a[i] then  
            // update the previous value by incrementing  
          // by 1 
            if(m.containsKey(a[i])){ 
                int x = m.get(a[i]) + 1; 
                m.put(a[i],x);  
            } 
            else{ 
                m.put(a[i],1); 
            } 
              
        } 
       
        // mx store the frequency of element which 
        // occurs most in array . 
        int mx = 0; 
       
        // In this loop we calculate the maximum 
        // frequency and store it in variable mx. 
        for (int i = 0; i < n; ++i) 
            if (mx < m.get(a[i])) 
                mx = m.get(a[i]); 
       
        // By swapping we can adjust array only 
        // when the frequency of the element 
        // which occurs most is less than or 
        // equal to (n + 1)/2 . 
        if (mx > (n + 1) / 2) 
            System.out.println("NO"); 
        else
            System.out.println("YES"); 
    } 
          
    // Driver program to test the above function 
    public static void main (String[] args) { 
        int a[] = { 7, 7, 7, 7 }; 
        int n = 4; 
        distinctAdjacentElement(a, n); 
    } 
} 
// This code is contributed by Amit Kumar 

