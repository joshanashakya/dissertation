

// Java program to remove the characters 
// having odd frequencies in the string 
import java.util.*; 
  
class GFG  
{ 
       
    // Function to remove the characters which 
    // have odd frequencies in the string 
    static String removeOddFrequencyCharacters(String s) 
    { 
        // Create a map to store the 
        // frequency of each character 
        HashMap<Character, Integer> m = new HashMap<Character,Integer>(); 
        for (int i = 0; i < s.length(); i++) { 
            char p = s.charAt(i); 
            Integer count = m.get(p); 
            if( count == null) 
            { 
                count=0; 
                m.put(p,1); 
            } 
            else 
                m.put(p,count + 1); 
        } 
       
        // To store the new string 
        String new_string = ""; 
       
        // Remove the characters which 
        // have odd frequencies 
        for (int i = 0; i < s.length(); i++) { 
       
            // If the character has 
            // odd frequency then skip 
            if ((m.get(s.charAt(i))& 1)==1) 
                continue; 
       
            // Else concatenate the 
            // character to the new string 
            new_string += s.charAt(i); 
        } 
       
        // Return the modified string 
        return new_string; 
    } 
       
    // Driver code 
    public static void main(String []args) 
    { 
        String str = "geeksforgeeks"; 
       
        // Remove the characters which 
        // have odd frequencies 
        str = removeOddFrequencyCharacters(str); 
        System.out.print(str); 
    } 
} 
  
// This is contributed by chitranayal 

