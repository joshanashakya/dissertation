

// Java program to check if the count of 
// alphabets and numbers in a String 
// are equal or not. 
class GFG 
{ 
  
// Function to count the 
// number of alphabets 
static int countOfLetters(String str) 
{ 
    // Counter to store the number 
    // of alphabets in the String 
    int letter = 0; 
  
    // Every character in the String 
    // is iterated 
    for (int i = 0; i < str.length(); i++)  
    { 
  
        // To check if the character is 
        // an alphabet or not 
        if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') 
            || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) 
            letter++; 
    } 
  
    return letter; 
} 
  
// Function to count the number of numbers 
static int countOfNumbers(String str) 
{ 
    // Counter to store the number 
    // of alphabets in the String 
    int number = 0; 
  
    // Every character in the String is iterated 
    for (int i = 0; i < str.length(); i++)  
    { 
  
        // To check if the character is 
        // a digit or not 
        if (str.charAt(i) >= '0' && str.charAt(i) <= '9') 
            number++; 
    } 
  
    return number; 
} 
  
// Function to check if the 
// count of alphabets is equal to 
// the count of numbers or not 
static void check(String str) 
{ 
    if (countOfLetters(str) 
        == countOfNumbers(str)) 
        System.out.print("Yes\n"); 
    else
        System.out.print("No\n"); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str = "GeeKs01324"; 
    check(str); 
} 
} 
  
// This code is contributed by 29AjayKumar 

