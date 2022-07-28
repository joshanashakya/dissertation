

// Java implementation of the above approach 
class GFG  
{ 
    static boolean check(String s)  
    { 
  
        // creating a frequency array 
        int[] freq = new int[26]; 
  
        // Finding length of s 
        int n = s.length(); 
  
        // counting frequency of all characters 
        for (int i = 0; i < s.length(); i++) 
        { 
            freq[(s.charAt(i)) - 97] += 1; 
        } 
  
        // checking if any odd frequency 
        // is there or not 
        for (int i = 0; i < freq.length; i++)  
        { 
            if (freq[i] % 2 == 1)  
            { 
                return false; 
            } 
        } 
        return true; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        String s = "abaccaba"; 
        if (check(s))  
        { 
            System.out.println("Yes"); 
        }  
        else 
        { 
            System.out.println("No"); 
        } 
    } 
} 
  
// This code is contributed by Rajput-Ji 

