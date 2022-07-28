

// Java implementation to remove 
// all the anagram Strings 
import java.util.*; 
  
class GFG{ 
   
// Function to remove the anagram String 
static void removeAnagrams(String arr[], int N) 
{ 
    // vector to store the final result 
    Vector<String> ans = new Vector<String>(); 
   
    // data structure to keep a mark 
    // of the previously occured String 
    HashSet<String> found = new HashSet<String> (); 
   
    for (int i = 0; i < N; i++) { 
   
        String word = arr[i]; 
   
        // Sort the characters 
        // of the current String 
        word = sort(word); 
   
        // Check if current String is not 
        // present inside the hashmap 
        // Then push it in the resultant vector 
        // and insert it in the hashmap 
        if (!found.contains(word)) { 
   
            ans.add(arr[i]); 
            found.add(word); 
        } 
    } 
   
    // Sort the resultant vector of Strings 
    Collections.sort(ans); 
   
    // Print the required array 
    for (int i = 0; i < ans.size(); ++i) { 
        System.out.print(ans.get(i)+ " "); 
    } 
} 
static String sort(String inputString)  
{  
    // convert input string to char array  
    char tempArray[] = inputString.toCharArray();  
        
    // sort tempArray  
    Arrays.sort(tempArray);  
        
    // return new sorted string  
    return new String(tempArray);  
} 
    
// Driver code 
public static void main(String[] args) 
{ 
    String arr[] 
        = { "geeks", "keegs", 
            "code", "doce" }; 
    int N = 4; 
   
    removeAnagrams(arr, N); 
} 
} 
  
// This code is contributed by 29AjayKumar 

