

// Java implementation of the approach 
class GFG 
{ 
      
// Function to return the count of deletions 
// of sub-strings "01" or "10" 
static int substrDeletion(String str, int len) 
{ 
  
    // To store the count of 0s and 1s 
    int count0 = 0, count1 = 0; 
  
    for (int i = 0; i < len; i++) 
    { 
        if (str.charAt(i) == '0') 
            count0++; 
        else
            count1++; 
    } 
  
    return Math.min(count0, count1); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str = "010"; 
    int len = str.length(); 
    System.out.println(substrDeletion(str, len)); 
} 
} 
  
// This code is contributed by Code_Mech. 

