

// Java implementation of the approach 
import java.util.*; 
class GFG 
{ 
      
static boolean find(char x[], char c) 
{ 
    for(int i = 0; i < x.length; i++) 
    if(x[i] == c) 
    return true; 
    return false; 
} 
  
static boolean find(Vector<Character> v,char c) 
{ 
    for(int i = 0; i < v.size(); i++) 
    if(v.get(i) == c) 
    return true; 
    return false; 
} 
  
static void addAllVowel(String str)  
{ 
    // All vowels 
    char x[] = {'A', 'E', 'I', 'O', 'U'}; 
  
    // List to store distinct vowels 
    Vector<Character> y = new Vector<>(); 
    int length = str.length(); 
  
    // if length of String is less than 5  
    // then always Impossible 
    if (length < 5) 
        System.out.println("Impossible"); 
    else
    { 
        // Storing the distinct vowels in the String 
        // by checking if it in the list of String and not 
        // in the list of distinct vowels 
        for (int i = 0; i < length; i++)  
        { 
            if (find(x, str.charAt(i))&& 
                !find(y, str.charAt(i))) 
                y.add(str.charAt(i)); 
        } 
  
        // Storing the vowels which are  
        // not present in the String 
        Vector<Character> z = new Vector<>(); 
        for (int i = 0; i < 5; i++) 
            if (!find(y, x[i]) )  
                z.add(x[i]); 
  
        // No replacement needed condition 
        if (z.size() == 0) 
            System.out.println( str ); 
        else
        { 
            int cc = 0; 
            Vector<Character> y1 = new Vector<>(); 
            String ans = ""; 
          
            // Replacing the characters to get all Vowels 
            for (int i = 0; i < length; i++)  
            { 
            if (find(x, str.charAt(i))&& 
                !find(y1, str.charAt(i))) 
                { 
                    ans += str.charAt(i); 
                    y1.add(str.charAt(i)); 
                } 
                else
                { 
                    ans += z.get(cc); 
                    cc++; 
                } 
                if (cc == z.size()) 
                { 
                    //copy th rest of the string 
                    for(int j = i + 1; j < length; j++) 
                    ans += str.charAt(j); 
                    break; 
                } 
            } 
            System.out.println(ans); 
        } 
    } 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    String str = "ABCDEFGHI"; 
    addAllVowel(str); 
} 
} 
  
// This code is contributed by Arnab Kundu 

