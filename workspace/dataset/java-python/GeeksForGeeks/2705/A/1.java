

// Java implementation of the approach 
import java.util.*; 
  
class GFG { 
  
    // Function to return the number of ways 
    // to partition the given so that the 
    // given condition is satisfied 
    static int countWays(String str, int m) 
    { 
  
        // Hashset to store unique characters 
        // in the given string 
        HashSet<Character> set = new HashSet<Character>(); 
        for (int i = 0; i < str.length(); i++) 
            set.add(str.charAt(i)); 
  
        // To store the number of ways 
        // to partition the string 
        int result = 0; 
  
        for (int i = 1; i < str.length(); i++) { 
  
            // Hashmaps to store frequency of characters 
            // of both the partitions 
            HashMap<Character, Integer> first_map 
                = new HashMap<Character, Integer>(); 
            HashMap<Character, Integer> second_map 
                = new HashMap<Character, Integer>(); 
  
            // Iterate in the first partition 
            for (int j = 0; j < i; j++) { 
  
                // If character already exists in the hashmap 
                // then increase it's frequency 
                if (first_map.containsKey(str.charAt(j))) 
                    first_map.put(str.charAt(j), 
                                  (first_map.get(str.charAt(j)) + 1)); 
  
                // Else create an entry for it in the Hashmap 
                else
                    first_map.put(str.charAt(j), 1); 
            } 
  
            // Iterate in the second partition 
            for (int k = i; k < str.length(); k++) { 
  
                // If character already exists in the hashmap 
                // then increase it's frequency 
                if (second_map.containsKey(str.charAt(k))) 
                    second_map.put(str.charAt(k), 
                                   (second_map.get(str.charAt(k)) + 1)); 
  
                // Else create an entry for it in the Hashmap 
                else
                    second_map.put(str.charAt(k), 1); 
            } 
  
            // Iterator for HashSet 
            Iterator itr = set.iterator(); 
  
            // To store the count of characters that have 
            // equal frequencies in both the partitions 
            int total_count = 0; 
  
            while (itr.hasNext()) { 
  
                // first_count and second_count keeps track 
                // of the frequencies of each character 
                int first_count = 0, second_count = 0; 
                char ch = (char)itr.next(); 
  
                // Frequency of the character 
                // in the first partition 
                if (first_map.containsKey(ch)) 
                    first_count = first_map.get(ch); 
  
                // Frequency of the character 
                // in the second partition 
                if (second_map.containsKey(ch)) 
                    second_count = second_map.get(ch); 
  
                // Check if frequency is same in both the partitions 
                if (first_count == second_count && first_count != 0) 
                    total_count += 1; 
            } 
  
            // Check if the condition is satisfied 
            // for the current partition 
            if (total_count >= m) 
                result += 1; 
        } 
  
        return result; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String str = "aabbccaa"; 
        int m = 2; 
        System.out.println(countWays(str, m)); 
    } 
} 

