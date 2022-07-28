

// Java program to find lexicographically  
// smallest string such that count of  
// subsequence 'xy' and 'yx' is p and  
// q respectively. 
import java.util.*; 
  
class GFG 
{ 
static int nx = 0, ny = 0;  
      
static boolean check(String s,  
                     int p, int q)  
{  
    // count total 'x' and 'y' in string  
    for (int i = 0; i < s.length(); ++i) 
    {  
        if (s.charAt(i) == 'x')  
            nx++;  
        else
            ny++;  
    }  
  
    // condition to check  
    // existence of answer  
    if ((nx * ny) != (p + q))  
        return true;  
    else
        return false;  
}  
  
public static String smallestPermutation(String s, 
                                         int p, int q) 
{ 
    if (check(s, p, q) == true)  
    {  
        return "Impossible";  
    } 
          
    char tempArray[] = s.toCharArray(); 
    Arrays.sort(tempArray); 
      
    String str = new String(tempArray);  
    int a = nx * ny, b = 0, i = 0, j = 0; 
          
    if (a == p && b == q)  
    {  
        return str;  
    } 
      
    while (1 > 0)  
    {  
          
    // Find index of 'x' to swap with 'y'.  
    for (i = 0; i < str.length() - 1; ++i) 
    {  
        if (str.charAt(i) == 'x' &&  
            str.charAt(i + 1) == 'y')  
            break;  
    }  
  
    for (j = i; j < str.length() - 1; j++)  
    {  
        if (str.charAt(j) == 'x' &&  
            str.charAt(j + 1) == 'y')  
        {  
        StringBuilder sb = new StringBuilder(str); 
        sb.setCharAt(j, str.charAt(j + 1)); 
        sb.setCharAt(j + 1, str.charAt(j)); 
        str = sb.toString(); 
        /* char ch[] = str.toCharArray(); 
            char temp = ch[j+1]; 
            ch[j+1] = ch[j]; 
            ch[j] = temp;*/
              
            a--; // 'xy' decrement by 1  
            b++; // 'yx' increment by 1  
  
            // check if count of 'xy' and  
            // 'yx' becomes equal to p  
            // and q respectively.  
            if (a == p && b == q)  
            {  
                return str;  
            }  
        }  
    }  
} 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    String s = "yxxyx";  
    int p = 3, q = 3; 
      
    System.out.print(smallestPermutation(s, p, q)); 
} 
} 
  
// This code is contributed by Kirti_Mangal 

