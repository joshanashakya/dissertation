

// Java implementation of the approach  
class GFG  
{ 
    final static int MAX = 26;  
      
    static int max_element(int freq[]) 
    { 
        int max_ele = freq[0]; 
        for(int i = 0; i < MAX; i++) 
        { 
            if(max_ele < freq[i]) 
                max_ele = freq[i]; 
        } 
        return max_ele; 
    } 
      
    // Function to return the minimum additions  
    // required to balance the given string  
    static int minimumAddition(String str, int len)  
    {  
      
        // To store the frequency of  
        // the characters of str  
        int freq[] = new int[MAX]; 
      
        // Update the frequency of the characters  
        for (int i = 0; i < len; i++)  
        {  
            freq[str.charAt(i) - 'a']++;  
        }  
      
        // To store the maximum frequency from the array  
        int maxFreq = max_element(freq);  
      
        // To store the minimum additions required  
        int minAddition = 0;  
        for (int i = 0; i < MAX; i++)  
        {  
      
            // Every character's frequency must be  
            // equal to the frequency of the most  
            // frequently occurring character  
            if (freq[i] > 0)  
            {  
                minAddition += Math.abs(maxFreq - freq[i]);  
            }  
        }  
        return minAddition;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        String str = "geeksforgeeks";  
        int len = str.length();  
      
        System.out.println(minimumAddition(str, len));  
    }  
} 
  
// This code is contributed by AnkitRai01 

