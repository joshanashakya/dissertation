

// Java implementation of the approach  
import java.util.Collections; 
import java.util.HashMap; 
import java.util.Vector; 
  
class GFG  
{ 
  
    // function that checks 
    // if the frequencies 
    // are in Lucas sequence. 
    static String lucas_sequence(String s,  
                                 int n)  
    { 
  
        // map is used to store 
        // character frequencies 
        HashMap<Character,  
                Integer> m = new HashMap<>(); 
        for (int i = 0; i < n; i++) 
            m.put(s.charAt(i),  
            m.get(s.charAt(i)) == null ? 1 :  
            m.get(s.charAt(i)) + 1); 
  
        Vector<Integer> v1 = new Vector<>(); 
        Vector<Integer> v2 = new Vector<>(); 
  
        // frequencies are extracted from 
        // map and stored in vector v1 
        for (HashMap.Entry<Character,  
                           Integer> entry : m.entrySet()) 
            v1.add(entry.getValue()); 
  
        // vector v1 elements are sorted, 
        // but first and second element are 
        // changed to '2' and '1' respectively, 
        // only if '1' and '2' are present in the vector. 
        Collections.sort(v1); 
        if (v1.elementAt(0) == 1 && 
            v1.elementAt(1) == 2)  
        { 
            v1.set(0, 2); 
            v1.set(1, 1); 
        }  
        else
            return "NO"; 
  
        // a and b are first and 
        // second terms of 
        // Lucas sequence 
        int a = 2, b = 1; 
        int c; 
        v2.add(a); 
        v2.add(b); 
  
        // v2 contains Lucas sequence 
        for (int i = 0; i < v1.size() - 2; i++) 
        { 
            v2.add(a + b); 
            c = a + b; 
            a = b; 
            b = c; 
        } 
        int flag = 1; 
  
        // both vectors are compared 
        for (int i = 0; i < v1.size(); i++)  
        { 
            if (v1.elementAt(i) != v2.elementAt(i)) 
            { 
                flag = 0; 
                break; 
            } 
        } 
  
        if (flag == 1) 
            return "YES"; 
        else
            return "NO"; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        String s = "oooeeeeqkk"; 
        int n = s.length(); 
        System.out.println(lucas_sequence(s, n)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

