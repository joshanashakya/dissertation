

// Java program to answer 
// queries for frequencies 
// in O(1) time. 
  
import java.io.*; 
import java.util.*; 
  
class GFG { 
      
   static HashMap <Integer, Integer> hm = new HashMap<Integer, Integer>(); 
  
   static void countFreq(int a[], int n) 
   { 
        // Insert elements and their  
        // frequencies in hash map. 
        for (int i=0; i<n; i++) 
            if (hm.containsKey(a[i]) ) 
                hm.put(a[i], hm.get(a[i]) + 1); 
            else hm.put(a[i] , 1); 
    } 
      
    // Return frequency of x (Assumes that  
    // countFreq() is called before) 
    static int query(int x) 
    { 
        if (hm.containsKey(x)) 
            return hm.get(x); 
        return 0; 
    } 
      
    // Driver program 
    public static void main (String[] args) { 
        int a[] = {1, 3, 2, 4, 2, 1}; 
        int n = a.length; 
        countFreq(a, n); 
        System.out.println(query(2)); 
        System.out.println(query(3)); 
        System.out.println(query(5)); 
    } 
    } 
  
// This code is contributed by Ansu Kumari 

