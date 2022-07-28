

// Java program to count all words with count 
// exactly 2. 
import java.util.HashMap; 
import java.util.Map; 
public class GFG { 
       
    // Returns count of words with frequency 
    // exactly 2. 
    static int countWords(String str[], int n) 
    { 
        // map to store count of each word 
        HashMap<String, Integer> m = new HashMap<>(); 
          
        for (int i = 0; i < n; i++){ 
            if(m.containsKey(str[i])){ 
                int get = m.get(str[i]); 
                m.put(str[i], get + 1); 
            } 
            else{ 
                m.put(str[i], 1); 
            } 
        } 
              
        int res = 0; 
        for (Map.Entry<String, Integer> it: m.entrySet()){ 
            if(it.getValue() == 2) 
                res++; 
        } 
                  
        return res; 
    } 
       
    // Driver code 
    public static void main(String args[]) 
    { 
        String s[] = { "hate", "love", "peace", "love", 
                       "peace", "hate", "love", "peace", 
                       "love", "peace" }; 
        int n = s.length; 
        System.out.println( countWords(s, n)); 
    } 
} 
// This code is contributed by Sumit Ghosh 

