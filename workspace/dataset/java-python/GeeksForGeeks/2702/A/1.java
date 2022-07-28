

// Java implementation to find the 
// maximum repeated frequency of  
// characters in the given String 
import java.util.*; 
  
class GFG{ 
  
// Function to find the maximum 
// repeated frequency of the  
// characters in the given String 
static void findMaxFrequency(String s) 
{ 
    // Hash-Array to store the  
    // frequecy of characters 
    int arr[] = new int[26]; 
      
    // Loop to find the frequecy 
    // of the characters 
    for (int i = 0; i < s.length(); i++) 
        arr[s.charAt(i) - 'a']++; 
      
    // Hash map to store the occurence 
    // of frequencies of characters 
    HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>(); 
    for (int i = 0; i < 26; i++) 
        if (arr[i] != 0) { 
            if(hash.containsKey(arr[i])){ 
                hash.put(arr[i], hash.get(arr[i])+1); 
            } 
            else{ 
                hash.put(arr[i], 1); 
            } 
        } 
      
    // Loop to find the maximum 
    // Repeated frequency from hash-map 
    int max_count = 0, res = -1; 
    for (Map.Entry<Integer,Integer> i : hash.entrySet()){ 
        if (max_count < i.getValue()) { 
            res = i.getKey(); 
            max_count = i.getValue(); 
        } 
    } 
  
    System.out.println("Frequency " + res+ " is repeated "
        + max_count+" times"); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    String s = "geeksgeeks"; 
      
    // Function Call 
    findMaxFrequency(s); 
} 
} 
  
// This code is contributed by sapnasingh4991 

