

// Java program to find if its possible 
// to distribute balls without repitiio 
import java.io.*; 
  
public class GFG { 
  
    static int MAX_CHAR = 26; 
      
    // function to find if its possible 
    // to distribute balls or not 
    static boolean distributingBalls(long k, 
                         long n, String str) 
    {  
          
        // count array to count how many 
        // times each color has occurred 
        int []a = new int[MAX_CHAR]; 
          
        for (int i = 0; i < n; i++) 
        { 
              
            // increasing count of each 
            // color every time it appears 
            a[str.charAt(i) - 'a']++;  
        } 
          
        for (int i = 0; i < MAX_CHAR; i++)  
      
            // to check if any color appears  
            // more than K times if it does  
            // we will print NO 
            if (a[i] > k)  
                return false; 
      
        return true; 
    } 
      
    // Driver code 
    static public void main (String[] args) 
    { 
        long n = 6, k = 3; 
        String str = "aacaab"; 
      
        if (distributingBalls(k, n, str)) 
            System.out.println("YES"); 
        else
            System.out.println("NO"); 
    } 
} 
  
// This code is contributed by vt_m. 

