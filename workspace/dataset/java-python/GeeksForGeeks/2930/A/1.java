

// Java program to count cumlative  
// frequencies of elements in an unsorted array.  
import java.util.*; 
  
class GFG  
{ 
    static void countFreq(int[] a, int n)  
    { 
  
        // Insert elements and their 
        // frequencies in hash map. 
        HashMap<Integer,  
                Integer> hm = new HashMap<>(); 
        for (int i = 0; i < n; i++) 
            hm.put(a[i], hm.get(a[i]) == null ?  
                     1 : hm.get(a[i]) + 1); 
  
        // Declare a Map 
        SortedMap<Integer, Integer> st = new TreeMap<>(); 
  
        // insert the element and 
        // and insert its frequency in a set 
        for (HashMap.Entry<Integer, 
                           Integer> x : hm.entrySet())  
        { 
            st.put(x.getKey(), x.getValue()); 
        } 
  
        int cumul = 0; 
  
        // iterate the set and print the 
        // cumulative frequency 
        for (SortedMap.Entry<Integer,  
                             Integer> x : st.entrySet()) 
        { 
            cumul += x.getValue(); 
            System.out.println(x.getKey() + " " + cumul); 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        int[] a = { 1, 3, 2, 4, 2, 1 }; 
        int n = a.length; 
        countFreq(a, n); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

