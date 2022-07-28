

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
    static void Count(int[] temp)  
    { 
        int[] query = {9, 3, 2}; 
        int Q = query.length; 
        for (int i = 0; i < Q; i++) 
        { 
            int pos = query[i]; 
            System.out.println(temp[pos - 1]); 
        } 
    } 
  
    static int[] processing(String s, int len)  
    { 
        int[] temp = new int[len]; 
        HashMap<Character,  
                Integer> d = new HashMap<Character, 
                                         Integer>(); 
        for (int i = 0; i < len; i++)  
        { 
            if (!d.containsKey(s.charAt(i))) 
            { 
                d.put(s.charAt(i), i); 
            }  
            else 
            { 
                temp[i] = temp[d.get(s.charAt(i))] + 1; 
                d.put(s.charAt(i), i); 
            } 
        } 
        return temp; 
    } 
  
    // Driver Code  
    public static void main(String[] args)  
    { 
        String s = "abacsddaa"; 
        int n = s.length(); 
        int[] temp = processing(s, n); 
        Count(temp); 
    } 
} 
  
// This code is contributed by Rajput-Ji 

