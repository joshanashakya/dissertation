

// Java program to print the most occurring 
// character in an array of Strings 
import java.util.*; 
  
class GFG 
{ 
  
// Function to print the most occurring character 
static void findMostOccurringChar(Vector<String> str) 
{ 
  
    // Creating a hash of size 26 
    int []hash = new int[26]; 
  
    // For loop to iterate through 
    // every String of the array 
    for (int i = 0; i < str.size(); i++) 
    { 
  
        // For loop to iterate through 
        // every character of the String 
        for (int j = 0; j < str.get(i).length(); j++)  
        { 
  
            // Incrementing the count of 
            // the character in the hash 
            hash[str.get(i).charAt(j)-97]++; 
        } 
    } 
  
    // Finding the character 
    // with the maximum count 
    int max = 0; 
    for (int i = 0; i < 26; i++)  
    { 
        max = hash[i] > hash[max] ? i : max; 
    } 
  
    System.out.print((char)(max + 97) +"\n"); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
  
    // Declaring Vector of String type 
    Vector<String> str = new Vector<String>(); 
    str.add("animal"); 
    str.add("zebra"); 
    str.add("lion"); 
    str.add("giraffe"); 
  
    findMostOccurringChar(str); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

