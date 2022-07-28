

// Java implementation of the above approach 
import java.util.*; 
  
class GFG 
{ 
  
    // Function to find Longest prefix string with the  
    // highest frequency 
    static void prefix(char[] str)  
    { 
        int k = 1, j; 
        int n = str.length; 
  
        Vector<Integer> g = new Vector<>(); 
        int flag = 0; 
  
        // storing all indices where first element is found 
        for (int i = 1; i < n; i++) 
        { 
            if (str[i] == str[0]) 
            { 
                g.add(i); 
                flag = 1; 
            } 
        } 
  
        // if the first letter in the string does not occur  
        // again then answer will be the whole string 
        if (flag == 0)  
        { 
            System.out.println(String.valueOf(str)); 
        } 
        else
        { 
            int len = g.size(); 
  
            // loop till second appearance of the first element 
            while (k < g.get(0))  
            { 
  
                int cnt = 0; 
                for (j = 0; j < len; j++)  
                { 
  
                    // check one letter after every stored index 
                    if ((g.get(j) + k) < n &&  
                        str[g.get(j) + k] == str[k]) 
                    { 
                        cnt++; 
                    } 
                } 
  
                // If there is no mismatch we move forward 
                if (cnt == len) 
                { 
                    k++; 
                }  
                // otherwise we stop 
                else 
                { 
                    break; 
                } 
            } 
  
            for (int i = 0; i < k; i++)  
            { 
                System.out.print(str[i]); 
            } 
  
            System.out.println(); 
        } 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        String str = "abcab"; 
        prefix(str.toCharArray()); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

