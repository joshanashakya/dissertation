

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function to find the partition of the 
// string such that both parts have at 
// least k different characters 
static void division_of_string(char[] str, int k) 
{ 
    // Length of the string 
    int n = str.length; 
  
    // To check if the current  
    // character is already found 
    Map<Character, Boolean> has = new HashMap<>(); 
  
    int ans = 0, cnt = 0, i = 0; 
  
    // Count number of different 
    // characters in the left part 
    while (i < n) 
    { 
  
        // If current character is not  
        // already found, increase cnt by 1 
        if (!has.containsKey(str[i]))  
        { 
            cnt++; 
            has.put(str[i], true); 
        } 
  
        // If count becomes equal to k, we've  
        // got the first part, therefore, 
        // store current index and break the loop 
        if (cnt == k)  
        { 
            ans = i; 
            break; 
        } 
  
        i++; 
    } 
  
    // Clear the map 
    has.clear(); 
  
    // Assign cnt as 0 
    cnt = 0; 
  
    while (i < n)  
    { 
  
        // If the current character is not  
        // already found, increase cnt by 1 
        if (!has.containsKey(str[i])) 
        { 
            cnt++; 
            has.put(str[i], true); 
        } 
  
        // If cnt becomes equal to k, the 
        // second part also have k different 
        // characters so break it 
        if (cnt == k) 
        { 
            break; 
        } 
  
        i++; 
    } 
  
    // If the second part has less than 
    // k different characters, then  
    // print "Not Possible" 
    if (cnt < k) 
    { 
        System.out.println("Not possible"); 
    } 
  
    // Otherwise print both parts 
    else 
    { 
        i = 0; 
        while (i <= ans) 
        { 
            System.out.print(str[i]); 
            i++; 
        } 
        System.out.println(""); 
  
        while (i < n)  
        { 
            System.out.print(str[i]); 
            i++; 
        } 
        System.out.println(""); 
    } 
  
    System.out.println(""); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    String str = "geeksforgeeks"; 
    int k = 4; 
  
    // Function call 
    division_of_string(str.toCharArray(), k); 
} 
} 
  
// This code is contributed by 29AjayKumar 

