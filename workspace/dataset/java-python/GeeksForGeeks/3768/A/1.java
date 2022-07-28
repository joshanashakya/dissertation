

// Java implementation of the approach 
import java.util.HashMap; 
class GFG { 
  
    // Function to return the minimum replacements 
    public static int minReplace(int a[], int n) 
    { 
        int i; 
  
        // Map to store the frequency of 
        // the numbers at the even indices 
        HashMap<Integer, Integer> te = new HashMap<>(); 
  
        // Map to store the frequency of 
        // the numbers at the odd indices 
        HashMap<Integer, Integer> to = new HashMap<>(); 
  
        for (i = 0; i < n; i++) { 
  
            // Checking if the index 
            // is odd or even 
            if (i % 2 == 0) { 
  
                // If the number is already present then, 
                // just increase the occurrence by 1 
                if (te.containsKey(a[i])) 
                    te.put(a[i], te.get(a[i]) + 1); 
                else
                    te.put(a[i], 1); 
            } 
            else { 
  
                // If the number is already present then, 
                // just increase the occurrence by 1 
                if (to.containsKey(a[i])) 
                    to.put(a[i], to.get(a[i]) + 1); 
                else
                    to.put(a[i], 1); 
            } 
        } 
  
        // To store the character with 
        // maximum frequency in even indices. 
        int me = -1; 
  
        // To store the character with 
        // maximum frequency in odd indices. 
        int mo = -1; 
  
        // To store the frequency of the 
        // maximum occurring number in even indices. 
        int ce = -1; 
  
        // To store the frequency of the 
        // maximum occurring number in odd indices. 
        int co = -1; 
  
        // Iterating over Map of even indices to 
        // get the maximum occurring number. 
        for (Integer It : te.keySet()) { 
            if (te.get(It) > ce) { 
                ce = te.get(It); 
                me = It; 
            } 
        } 
  
        // Iterating over Map of odd indices to 
        // get the maximum occurring number. 
        for (Integer It : to.keySet()) { 
            if (to.get(It) > co) { 
                co = to.get(It); 
                mo = It; 
            } 
        } 
  
        // To store the final answer 
        int res = 0; 
  
        for (i = 0; i < n; i++) { 
            if (i % 2 == 0) { 
  
                // If the index is even but 
                // a[i] != me 
                // then a[i] needs to be replaced 
                if (a[i] != me) 
                    res++; 
            } 
            else { 
  
                // If the index is odd but 
                // a[i] != mo 
                // then a[i] needs to be replaced 
                if (a[i] != mo) 
                    res++; 
            } 
        } 
  
        return res; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n; 
        n = 4; 
        int a[] = { 3, 1, 3, 2 }; 
        System.out.println(minReplace(a, n)); 
    } 
} 

