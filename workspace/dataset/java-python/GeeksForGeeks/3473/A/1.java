

// Java implementation of the  
// above approach  
class GFG 
{ 
      
// Function to count the words  
static void CountWords(String str, int k)  
{ 
    // Sum of ascii values  
    int sum = 0; 
  
    int NumberOfWords = 0; 
  
    // Number of words having  
    // sum of ascii less than k  
    int counter = 0; 
  
    int len = str.length(); 
  
    for (int i = 0; i < len; ++i)  
    { 
        // If character is a space  
        if (str.charAt(i) == ' ')  
        { 
            if (sum < k) 
            { 
                counter++; 
            } 
  
            sum = 0; 
            NumberOfWords++; 
        } 
          
        else // Add the ascii value to sum  
        { 
            sum += str.charAt(i); 
        } 
    } 
  
    // Handling the Last word separately  
    NumberOfWords++; 
    if (sum < k) 
    { 
        counter++; 
    } 
  
    System.out.println("Number of words having sum " +  
                    "of ASCII values less than k = " +  
                                             counter); 
    System.out.println("Number of words having sum of " +  
           "ASCII values greater than or equal to k = " + 
                              (NumberOfWords - counter)); 
} 
  
// Driver code  
public static void main(String[] args)  
{ 
    String str = "Learn how to code"; 
    int k = 400; 
    CountWords(str, k); 
} 
} 
  
// This code is contributed by RAJPUT-JI 

