

// Java program to find the N-th character 
// in the string "1234567891011.." 
  
  
class GFG 
{ 
    // Function that returns the N-th character 
    static char NthCharacter(int n) 
    { 
        // initially null string 
        String s = ""; 
      
        // starting integer 
        int c = 1; 
      
        // add integers in string 
        for (int i = 1;; i++) { 
      
            // one digit numbers added 
            if (c < 10) 
                s += Integer.toString(c); 
      
            // more than 1 digit number, generate 
            // equivalent number in a string s1 
            // and concatenate s1 into s. 
            else
            { 
                String s1 = ""; 
                int dup = c; 
      
                // add the number in string 
                while (dup >0) { 
                    s1 += Integer.toString(dup % 10); 
                    dup /= 10; 
                } 
            
                // reverse the string 
                StringBuilder temp = new StringBuilder();  
                temp.append(s1);  
                temp = temp.reverse();  
                  
                // attach the number 
                s += temp; 
            } 
            c++; 
      
            // if the length exceeds N 
            if (s.length() >= n) { 
                return s.charAt(n - 1); 
            } 
        } 
    } 
      
    // Driver Code 
    public static void main(String []args) 
    { 
        int n = 11; 
      
        System.out.println( NthCharacter(n)); 
      
          
    } 
  
} 
  
// This article is contributed by ihritik 

