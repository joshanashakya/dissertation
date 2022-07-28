

// Java program to move every character  
// K times ahead in a given string  
  
class GFG { 
  
// Function to move string character  
    static void encode(String s, int k) { 
  
        // changed string  
        String newS = ""; 
  
        // iterate for every characters  
        for (int i = 0; i < s.length(); ++i) { 
            // ASCII value  
            int val = s.charAt(i); 
            // store the duplicate  
            int dup = k; 
  
            // if k-th ahead character exceed 'z'  
            if (val + k > 122) { 
                k -= (122 - val); 
                k = k % 26; 
                  
                newS += (char)(96 + k); 
            } else { 
                newS += (char)(val + k); 
            } 
  
            k = dup; 
        } 
  
        // print the new string  
        System.out.println(newS); 
    } 
  
// Driver Code  
    public static void main(String[] args) { 
        String str = "abc"; 
        int k = 28; 
  
        // function call  
        encode(str, k); 
    } 
} 
  
// This code is contributed by Rajput-JI  

