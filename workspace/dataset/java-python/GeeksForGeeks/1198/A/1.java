

// Java implementation of the above approach 
class GFG 
{ 
  
// Function to return the word 
// of the corresponding digit 
static void printValue(char digit) 
{ 
  
    // Switch block to check for each digit c 
    switch (digit) 
    { 
  
    // For digit 0 
    case '0': 
        System.out.print("Zero "); 
        break; 
  
    // For digit 1 
    case '1': 
        System.out.print("One "); 
        break; 
  
    // For digit 2 
    case '2': 
        System.out.print("Two "); 
        break; 
  
    // For digit 3 
    case '3': 
        System.out.print("Three "); 
        break; 
  
    // For digit 4 
    case '4': 
        System.out.print("Four "); 
        break; 
  
    // For digit 5 
    case '5': 
        System.out.print("Five "); 
        break; 
  
    // For digit 6 
    case '6': 
        System.out.print("Six "); 
        break; 
  
    // For digit 7 
    case '7': 
        System.out.print("Seven "); 
        break; 
  
    // For digit 8 
    case '8': 
        System.out.print("Eight "); 
        break; 
  
    // For digit 9 
    case '9': 
        System.out.print("Nine "); 
        break; 
    } 
} 
  
// Function to iterate through every 
// digit in the given number 
static void printWord(String N) 
{ 
    int i, length = N.length(); 
  
    // Finding each digit of the number 
    for (i = 0; i < length; i++) 
    { 
  
        // Print the digit in words 
        printValue(N.charAt(i)); 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String N = "123"; 
    printWord(N); 
} 
} 
  
// This code is contributed by 29AjayKumar 

