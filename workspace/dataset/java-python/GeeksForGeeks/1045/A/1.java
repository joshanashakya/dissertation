

// Java program to find the maximum  
// length of a substring of form R^nK^n  
public class gfg {  
  
    // function to calculate the maximum  
    // length of substring of the form R^nK^n  
    int find(String s)  
    {  
        int max = 0, i, j = 0, countk = 0, countr = 0;  
        int table[][] = new int[s.length()][2];  
  
        // Count no. Of R's before a K  
        for (i = 0; i < s.length(); i++) {  
            if (s.charAt(i) == 'R')  
                countr++;  
            else
                table[j++][0] = countr;  
        }  
        j--;  
  
        // Count no. Of K's after a K  
        for (i = s.length() - 1; i >= 0; i--) {  
            if (s.charAt(i) == 'K') {  
                countk++;  
                table[j--][1] = countk;  
            }  
  
            // Update maximum length  
            if (Math.min(table[j + 1][0], table[j + 1][1]) > max)  
                max = Math.min(table[j + 1][0], table[j + 1][1]);  
        }  
  
        return max;  
    }  
  
    // Driver code  
    public static void main(String srgs[])  
    {  
        String s = "RKRRRKKRRKKKKRR";  
        gfg ob = new gfg();  
        int n = ob.find(s);  
        System.out.println(n);  
    }  
}  

