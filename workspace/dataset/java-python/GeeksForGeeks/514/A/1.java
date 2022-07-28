

// java program to find position of a number 
// in a series of numbers with 4 and 7 as the 
// only digits. 
import java.util.*; 
  
class GFG { 
      
    static int findpos(String n) 
    { 
          
        int k = 0, pos = 0, i = 0; 
        while (k != n.length()) { 
  
            // check all digit position 
            switch (n.charAt(i)) { 
  
            // if number is left then pos*2+1 
            case '4': 
                pos = pos * 2 + 1; 
                break; 
  
            // if number is right then pos*2+2 
            case '7': 
                pos = pos * 2 + 2; 
                break; 
            } 
              
            i++; 
            k++; 
        } 
          
        return pos; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
          
        // given a number which is constructed 
        // by 4 and 7 digit only 
        String n = "774"; 
          
        System.out.println(findpos(n)); 
    } 
} 
  
// This code is contributed by Sam007. 

