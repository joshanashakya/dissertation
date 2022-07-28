

// Simple Java program to convert all substrings from 
// decimal to given base. 
  
class GFG 
{ 
  
static void substringConversions(String str, int k, int b) 
{ 
    for (int i=0; i + k <= str.length(); i++) 
    { 
        // Saving substring in sub 
        String sub = str.substring(i, i+k);      
          
        // Evaluating decimal for current substring 
        // and printing it. 
        int sum = 0, counter = 0; 
        for (int j = sub.length() - 1; j >= 0; j--) 
        { 
            sum = (int) (sum + ((sub.charAt(j) - '0') * 
                                    Math.pow(b, counter))); 
            counter++; 
        }      
        System.out.print(sum + " "); 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str = "12212"; 
    int b = 3, k = 3; 
    substringConversions(str, b, k);  
} 
} 
  
// This code is contributed by 29AjayKumar 

