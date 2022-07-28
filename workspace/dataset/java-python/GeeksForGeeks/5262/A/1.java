

// Java implementation of the above approach 
import java.util.*; 
  
class GFG { 
      
// Function to count the number of 
// characters whose ascii value is less than k 
static int CountCharacters(String str, int k) 
{ 
    // Initialising the count to 0 
    int cnt = 0; 
  
    int len = str.length(); 
    for (int i = 0; i < len; i++) { 
        // Incrementing the count 
        // if the value is less 
        if (((int)str.charAt(i)) < k) 
            cnt++; 
    } 
  
    // return the count 
    return cnt; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    String str = "GeeksForGeeks"; 
    int k = 90; 
  
    int count = CountCharacters(str, k); 
    System.out.println("Characters with ASCII values less than K are "+count); 
  
    System.out.println("Characters with ASCII values greater than or equal to K are "+(str.length() - count)); 
  
} 
} 

