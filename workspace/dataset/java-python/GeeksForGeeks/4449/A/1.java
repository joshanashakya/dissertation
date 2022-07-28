

// Java program to accept String 
// starting with Vowel 
class GFG 
{ 
  
// Function to check if first character is vowel 
static int checkIfStartsWithVowels(char []str) 
{ 
  
    if (!(str[0] == 'A' || str[0] == 'a'
        || str[0] == 'E' || str[0] == 'e'
        || str[0] == 'I' || str[0] == 'i'
        || str[0] == 'O' || str[0] == 'o'
        || str[0] == 'U' || str[0] == 'u')) 
        return 1; 
    else
        return 0; 
} 
  
// Function to check 
static void check(String str) 
{ 
    if (checkIfStartsWithVowels(str.toCharArray()) == 1) 
        System.out.print("Not Accepted\n"); 
    else
        System.out.print("Accepted\n"); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str = "animal"; 
    check(str); 
  
    str = "zebra"; 
    check(str); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

