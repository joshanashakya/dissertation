

// Java implementation of the approach  
import java.util.*; 
  
class GFG  
{ 
static int MAX = 26;  
  
// Function to sort the given string  
// using counting sort  
static String countingsort(char[] s)  
{  
      
    // Array to store the count of each character  
    int []count = new int[MAX];  
    for (int i = 0; i < s.length; i++)  
    {  
        count[s[i] - 'a']++;  
    }  
    int index = 0;  
  
    // Insert characters in the string  
    // in increasing order  
    for (int i = 0; i < MAX; i++) 
    {  
        int j = 0;  
        while (j < count[i])  
        {  
            s[index++] = (char)(i + 'a');  
            j++;  
        }  
    }  
        return String.valueOf(s); 
}  
  
// Function that returns true if str can be  
// generated from any permutation of the  
// two strings selected from the given vector  
static boolean isPossible(Vector<String> v,  
                                 String str)  
{  
  
    // Sort the given string  
    str=countingsort(str.toCharArray());  
  
    // Select two strings at a time from given vector  
    for (int i = 0; i < v.size() - 1; i++)  
    {  
        for (int j = i + 1; j < v.size(); j++)  
        {  
  
            // Get the concatenated string  
            String temp = v.get(i) + v.get(j);  
  
            // Sort the resultant string  
            temp = countingsort(temp.toCharArray());  
  
            // If the resultant string is equal  
            // to the given string str  
            if (temp.equals(str))  
            {  
                return true;  
            }  
        }  
    }  
  
    // No valid pair found  
    return false;  
}  
  
// Driver code  
public static void main(String[] args)  
{ 
    String str = "amazon";  
    String []arr = { "fds", "oxq", "zoa", "epw", "amn" }; 
    Vector<String> v = new Vector<String>(Arrays.asList(arr)); 
  
    if (isPossible(v, str))  
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by 29AjayKumar 

