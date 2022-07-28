

// Java Program to implement the above approach  
import java.util.*; 
  
class Sol 
{ 
      
// Function to count the adjacent pairs of  
// consonant and vowels in the String  
static int countPairs(String s)  
{  
    // Using a set to store the vowels so that  
    // checking each character becomes easier  
    Set<Character> st=new HashSet<Character>();  
    st.add('a');  
    st.add('e');  
    st.add('i');  
    st.add('o');  
    st.add('u');  
  
    // Variable to store number of  
    // consonant-vowel pairs  
    int count = 0;  
  
    int n = s.length();  
  
    for (int i = 0; i < n - 1; i++) 
    {  
  
        // If the ith character is not found in the set,  
        // means it is a consonant  
        // And if the (i+1)th character is found in the set,  
        // means it is a vowel  
        // We increment the count of such pairs  
        if (st.contains(s.charAt(i)) && !st.contains(s.charAt(i + 1)))  
            count++;  
    }  
  
    return count;  
}  
  
// Driver Code  
public static void main(String args[]) 
{  
    String s = "geeksforgeeks";  
  
    System.out.println( countPairs(s));  
} 
} 
  
// This code is contributed by Arnab Kundu 

