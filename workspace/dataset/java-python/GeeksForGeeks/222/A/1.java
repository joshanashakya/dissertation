

// Java implementation of the above approach 
class GFG 
{ 
  
// Function for finding the smallest 
// possible number after swapping 
// the digits any number of times 
static String smallestPoss(String s, int n) 
{ 
    // Variable to store the final answer 
    String ans = ""; 
  
    // Array to store the count of 
    // occurrence of each digit 
    int arr[] = new int[10]; 
  
    // Loop to calculate the number 
    // of occurrences of every digit 
    for (int i = 0; i < n; i++) 
    { 
        arr[s.charAt(i) - 48]++; 
    } 
  
    // Loop to get smallest number 
    for (int i = 0; i < 10; i++) 
    { 
        for (int j = 0; j < arr[i]; j++) 
            ans = ans + String.valueOf(i); 
    } 
  
    // Returning the answer 
    return ans; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int N = 15; 
    String K = "325343273113434"; 
  
    System.out.print(smallestPoss(K, N)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

