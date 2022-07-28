

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function to return the minimum 
// cost to convert str1 to sr2 
static int minCost(char []str1,  
                   char []str2, int n) 
{ 
    int cost = 0; 
  
    // For every character of str1 
    for (int i = 0; i < n; i++)  
    { 
  
        // If current character is not 
        // equal in both the strings 
        if (str1[i] != str2[i]) 
        { 
  
            // If the next character is also different in both 
            // the strings then these characters can be swapped 
            if (i < n - 1 && str1[i + 1] != str2[i + 1])  
            { 
                swap(str1, i, i + 1); 
                cost++; 
            } 
  
            // Change the current character 
            else 
            { 
                cost++; 
            } 
        } 
    } 
    return cost; 
} 
  
static void swap(char []arr, int i, int j) 
{ 
    char temp = arr[i]; 
    arr[i] = arr[j]; 
    arr[j] = temp; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str1 = "abb", str2 = "bba"; 
    int n = str1.length(); 
  
    System.out.println(minCost(str1.toCharArray(),  
                               str2.toCharArray(), n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

