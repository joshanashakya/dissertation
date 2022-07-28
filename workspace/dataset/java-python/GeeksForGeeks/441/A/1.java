

// Java implmentation to check 
// wheather array of Strings 
// can correspond to a number X 
  
class GFG{ 
   
// Function to find the maximum  
// base possible for the number N 
static int val(char c) 
{ 
    if (c >= '0' && c <= '9') 
        return (int)c - '0'; 
    else
        return (int)c - 'A' + 10; 
} 
   
// Function to find the decimal 
// equivalent of the number 
static int toDeci(String str, int base) 
{ 
    int len = str.length(); 
    int power = 1; 
    int num = 0; 
    int i; 
    for (i = len - 1; i >= 0; i--) { 
           
        // Condition to check if the 
        // number is convertible  
        // to another base 
        if (val(str.charAt(i)) >= base) { 
            return -1; 
        } 
        num += val(str.charAt(i)) * power; 
        power = power * base; 
    } 
    return num; 
} 
   
// Function to check that the  
// array can correspond to a number X  
static void checkCorrespond(String[] str, 
                                int x){ 
                                       
    // counter to count the numbers 
    // those are convertible to X 
    int counter = 0; 
    int n = str.length; 
   
    // Loop to iterate over the array 
    for (int i = 0; i < n; i++) { 
        for (int j = 2; j <= 36; j++) { 
               
            // Convert the current String 
            // to every base for checking 
            // whether it will correspond 
            // to X from any base 
            if (toDeci(str[i], j) == x) { 
                counter++; 
                break; 
            } 
        } 
    } 
       
    // Condition to check if every 
    // number of the array can 
    // be converted to X 
    if (counter == n) 
        System.out.print("YES"
           + "\n"); 
    else
        System.out.print("NO"
           + "\n"); 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int x = 16; 
   
    // The set of Strings  
    // in base from [2, 36] 
    String[] str = 
         { "10000", "20", "16" }; 
    checkCorrespond(str, x); 
} 
} 
  
// This code contributed by PrinciRaj1992 

