

// Java implementation of the approach 
class GFG 
{ 
  
    // Function to return the count of valid pairs 
    static int totalPairs(String s1, String s2)  
    { 
        int count = 0; 
  
        int[] arr1 = new int[7]; 
        int[] arr2 = new int[7]; 
  
        // Default Initialise both arrays 0 
        // Store frequency of number of set bits for s1 
        for (int i = 0; i < s1.length(); i++)  
        { 
            int set_bits = Integer.bitCount(s1.charAt(i)); 
            arr1[set_bits]++; 
        } 
  
        // Store frequency of number of set bits for s2 
        for (int i = 0; i < s2.length(); i++)  
        { 
            int set_bits = Integer.bitCount(s2.charAt(i)); 
            arr2[set_bits]++; 
        } 
  
        // Calculate total pairs 
        for (int i = 1; i <= 6; i++) 
        { 
            count += (arr1[i] * arr2[i]); 
        } 
  
        // Return the count of valid pairs 
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
  
        String s1 = "geeks"; 
        String s2 = "forgeeks"; 
        System.out.println(totalPairs(s1, s2)); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

