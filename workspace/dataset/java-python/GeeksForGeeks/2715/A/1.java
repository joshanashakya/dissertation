

// Java implementation of above approach 
import java.util.HashMap; 
  
class GFG  
{ 
  
    // Function that checks if the frequency of character 
    // are a factor or multiple of each other 
    public static boolean multipleOrFactor(String s1, String s2) 
    { 
          
        // map store frequency of each character 
        HashMap<Character, Integer> m1 = new HashMap<>(); 
        HashMap<Character, Integer> m2 = new HashMap<>(); 
  
        for (int i = 0; i < s1.length(); i++)  
        { 
            if (m1.containsKey(s1.charAt(i))) 
            { 
                int x = m1.get(s1.charAt(i)); 
                m1.put(s1.charAt(i), ++x); 
            }  
            else
                m1.put(s1.charAt(i), 1); 
        } 
  
        for (int i = 0; i < s2.length(); i++) 
        { 
            if (m2.containsKey(s2.charAt(i)))  
            { 
                int x = m2.get(s2.charAt(i)); 
                m2.put(s2.charAt(i), ++x); 
            }  
            else
                m2.put(s2.charAt(i), 1); 
        } 
  
        for (HashMap.Entry<Character, Integer> entry : m1.entrySet())  
        { 
              
            // if any frequency is 0, then continue 
            // as condition is satisfied 
            if (!m2.containsKey(entry.getKey())) 
                continue; 
  
            // if factor or multiple, then condition satified 
            if (m2.get(entry.getKey()) != null &&  
                (m2.get(entry.getKey()) % entry.getValue() == 0
                || entry.getValue() % m2.get(entry.getKey()) == 0)) 
                continue; 
              
            // if condition not satisfied 
            else
                return false; 
        } 
        return true; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        String s1 = "geeksforgeeks", s2 = "geeks"; 
        if (multipleOrFactor(s1, s2)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
  
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

