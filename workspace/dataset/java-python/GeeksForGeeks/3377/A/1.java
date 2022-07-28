

    
// Java implementation of above approach 
import java.util.*; 
class solution 
{ 
  
// Function to return factorial 
// of the number passed as argument 
 static int fact(int n) 
{ 
     int result = 1; 
    for (int i = 1; i <= n; i++) 
        result *= i; 
    return result; 
} 
  
// Function to get the total permutations 
// which satisfy the given condition 
static int getResult(String str, char ch) 
{ 
    // Create has to store count 
    // of each character 
    int has[] = new int[26]; 
      
    for(int i=0;i<26;i++) 
    has[i]=0; 
  
    // Store character occurrences 
    for (int i = 0; i < str.length(); i++) 
        has[str.charAt(i) - 'A']++; 
  
    // Count number of times 
    // Particular character comes 
    int particular = has[ch - 'A']; 
  
    // If particular character isn't 
    // present in the string then return 0 
    if (particular == 0) 
        return 0; 
  
    // Remove count of particular character 
    has[ch - 'A'] = 0; 
  
    // Total length 
    // of the string 
    int total = str.length(); 
  
    // Assume all occurrences of 
    // particular character as a 
    // single character. 
    total = total - particular + 1; 
  
    // Compute factorial of the length 
     int result = fact(total); 
  
    // Divide by the factorials of 
    // the no. of occurrences of all 
    // the characters. 
    for (int i = 0; i < 26; i++) { 
        if (has[i] > 1) { 
            result = result / fact(has[i]); 
        } 
    } 
  
    // return the result 
    return result; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    String str = "MISSISSIPPI"; 
  
    // Assuming the string and the character 
    // are all in uppercase 
    System.out.println( getResult(str, 'S') ); 
  
} 
} 
//contributed by Arnab Kundu 

