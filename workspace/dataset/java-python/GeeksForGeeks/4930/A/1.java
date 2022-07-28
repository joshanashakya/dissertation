

// Java program to print all 
// distinct circular strings 
// of length M in lexicographical order 
import java.util.*; 
  
class GFG  
{ 
  
// Function to print all the distinct substrings 
// in lexicographical order 
static void printStrings(String s, int l, int m) 
{ 
    // stores all the distinct substrings 
    Set<String> c = new LinkedHashSet<>(); 
  
    // Append the string to self 
    s = s + s; 
  
    // Iterate over the length to generate 
    // all substrings of length m 
    for (int i = 0; i < l; i++)  
    { 
  
        // insert the substring of length m 
        // in the set 
            c.add(s.substring(i, i+m)); 
    } 
  
    // prints all the distinct circular 
    // substrings of length m 
    Iterator itr = c.iterator(); 
    while (itr.hasNext())  
    { 
  
        // Prints the substring 
        String a =(String) itr.next(); 
        System.out.print(a+" "); 
          
    } 
    c.clear(); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    String str = "saurav"; 
    int N = str.length(); 
    int M = 4; 
  
    printStrings(str, N, M); 
} 
} 
  
// This code contributed by Rajput-Ji 

