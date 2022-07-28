

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
// Function that counts 
// valid sub-strings 
static int count(String S, int X) 
{ 
    int count = 0; 
    int N = S.length(); 
    for (int i = 0; i < N; ++i) 
    { 
  
        // Only take those numbers 
        // that do not start with '0'. 
        if (S.charAt(i) != '0') 
        { 
            for (int len = 1;  
                (i + len) <= N; ++len)  
            { 
  
                // converting the sub-string 
                // starting from index 'i' 
                // and having length 'len' to  
                // int and checking if it is  
                // greater than X or not 
                int num = Integer.parseInt(S.substring(i, i + len)); 
                if (num > X) 
                    count++; 
            } 
        } 
    } 
    return count; 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    String S = "2222"; 
    int X = 97; 
    System.out.println(count(S, X)); 
} 
} 
  
// This code is contributed by ihritik 

