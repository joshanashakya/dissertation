

// Java implementation of the approach 
class GFG { 
  
    // Function to return the count of 
    // required occurrence 
    static int countOcc(String s) 
    { 
  
        // To store the count of occurrences 
        int cnt = 0; 
  
        // Check first four characters from ith position 
        for (int i = 0; i < s.length() - 3; i++) { 
  
            // Variables for counting the required characters 
            int c = 0, l = 0, a = 0, p = 0; 
  
            // Check the four contiguous characters which 
            // can be reordered to form 'clap' 
            for (int j = i; j < i + 4; j++) { 
                switch (s.charAt(j)) { 
                case 'c': 
                    c++; 
                    break; 
                case 'l': 
                    l++; 
                    break; 
                case 'a': 
                    a++; 
                    break; 
                case 'p': 
                    p++; 
                    break; 
                } 
            } 
  
            // If all four contiguous characters are present 
            // then increment cnt variable 
            if (c == 1 && l == 1 && a == 1 && p == 1) 
                cnt++; 
        } 
  
        return cnt; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        String s = "clapc"; 
        System.out.print(countOcc(s.toLowerCase())); 
    } 
} 

