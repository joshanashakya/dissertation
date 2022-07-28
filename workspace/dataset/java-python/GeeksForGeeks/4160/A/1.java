

// Java code to find last index 
// character x in given string. 
import java.io.*; 
class GFG { 
   
// Returns last index of x if 
// it is present. Else returns -1. 
static int findLastIndex(String str, Character x) 
{ 
    // Traverse from right 
    for (int i = str.length() - 1; i >= 0; i--) 
        if (str.charAt(i) == x) 
            return i; 
  
    return -1; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    String str = "geeksforgeeks"; 
    Character x = 'e'; 
    int index = findLastIndex(str, x); 
    if (index == -1) 
        System.out.println("Character not found"); 
    else
        System.out.println("Last index is " + index); 
} 
} 
// This code is contributed by Prerna Saini 

