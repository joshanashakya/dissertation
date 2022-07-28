

// Iterative Java Program to copy one String  
// to another. 
class GFG 
{ 
      
// Function to copy one string to other 
// assuming that other string has enough 
// space. 
static void myCopy(char s1[], char s2[]) 
{ 
    int i = 0; 
    for (i = 0; i < s1.length; i++) 
         s2[i] = s1[i]; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    char s1[] = "GEEKSFORGEEKS".toCharArray(); 
    char s2[] = new char[s1.length]; 
    myCopy(s1, s2); 
    System.out.println(String.valueOf(s2)); 
} 
} 
  
// This code contributed by Rajput-Ji 

