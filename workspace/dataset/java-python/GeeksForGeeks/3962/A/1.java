

// Java program to print all palindromic paths 
// from top left to bottom right in a grid. 
public class PalinPath { 
    public static boolean isPalin(String str) 
    { 
        int len = str.length() / 2; 
        for (int i = 0; i < len; i++) { 
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) 
                return false; 
        } 
        return true; 
    } 
  
    // i and j are row and column indexes of current cell  
    // (initially these are 0 and 0). 
    public static void palindromicPath(String str, char a[][], 
                                 int i, int j, int m, int n) 
    { 
            
        // If we have not reached bottom right corner, keep 
        // exlporing 
        if (j < m - 1 || i < n - 1) { 
          if (i < n - 1) 
             palindromicPath(str + a[i][j], a, i + 1, j, m, n); 
         if (j < m - 1) 
             palindromicPath(str + a[i][j], a, i, j + 1, m, n); 
        }  
  
        // If we reach bottom right corner, we check if 
        // if the path used is palindrome or not. 
        else { 
            str = str + a[n - 1][m - 1]; 
            if (isPalin(str)) 
                System.out.println(str); 
        } 
    } 
  
    // Driver code  
    public static void main(String args[]) 
    { 
        char arr[][] = { { 'a', 'a', 'a', 'b' }, 
                         { 'b', 'a', 'a', 'a' }, 
                         { 'a', 'b', 'b', 'a' } }; 
        String str = ""; 
        palindromicPath(str, arr, 0, 0, 4, 3); 
    } 
} 

