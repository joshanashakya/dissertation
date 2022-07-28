

// Java implementation of the above approach. 
import java.util.*; 
  
class GFG  
{ 
  
// Function to return the count of 
// distinct state codes 
static int countDistinctCode(String str) 
{ 
    Set<String> codes = new HashSet<>(); 
    for (int i = 0; i < str.length() - 1; i++) 
  
        // Insert every sub-String 
        // of length 2 in the set 
        codes.add(str.substring(i, i + 2)); 
  
    // Return the size of the set 
    return codes.size(); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str = "UPUP"; 
    System.out.println(countDistinctCode(str)); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

