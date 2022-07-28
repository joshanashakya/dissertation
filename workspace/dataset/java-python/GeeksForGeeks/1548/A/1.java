

// Java implementation of the above approach. 
  
import java.util.*; 
  
class GFG { 
  
    // Function to return the vertical order 
    // traversal of String 
    public static String printVertically(String s) 
    { 
        String result = ""; 
  
        // Hashmap to store the indices 
        // of the characters 
        HashMap<Integer, String> map 
            = new HashMap<>(); 
  
        Scanner sc = new Scanner(s); 
        int max = Integer.MIN_VALUE; 
  
        // Finding maximum length word 
        // from given string 
        while (sc.hasNext()) { 
            String st = sc.next(); 
            max = Math.max(max, st.length()); 
        } 
  
        sc = new Scanner(s); 
        while (sc.hasNext()) { 
            String st = sc.next(); 
  
            // Inserting strings in the hashmap 
            // in vertical fashion 
            // based on character index 
            for (int i = 0; i < st.length(); i++) { 
                char ch = st.charAt(i); 
                map.put(i, map.getOrDefault(i, "") + ch); 
            } 
  
            // If the string is smaller than the 
            // maximum length string, then 
            // add spaces in the string 
            for (int i = st.length(); i < max; i++) { 
                map.put(i, 
                        map.getOrDefault(i, 
                                         "") 
                            + "$"); 
            } 
        } 
  
        // Adding  all String values in the list 
        for (int i = 0; i < max; i++) { 
            String a = map.get(i); 
            result += a + " "; 
        } 
        return result; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String st = "ge ek sfor ge eks"; 
        System.out.println(printVertically(st)); 
    } 
} 

