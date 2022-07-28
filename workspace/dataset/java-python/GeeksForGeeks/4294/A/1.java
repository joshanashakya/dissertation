

// Program to print the given pattern 
class GFG  
{ 
static void print_asterisk(int asterisk) 
{ 
    if (asterisk == 0) 
        return; 
    System.out.print("* "); 
    print_asterisk(asterisk - 1); 
} 
  
// function to print the upper-half of the pattern 
static void pattern_upper(int n, int num) 
{ 
    // base case 
    if (n == 0) 
        return; 
    print_asterisk(n); 
    System.out.println(); 
  
    // recursively calling pattern_upper() 
    pattern_upper(n - 1, num); 
} 
  
// function to print the lower-half of the pattern 
static void pattern_lower(int n, int num) 
{ 
    // base case 
    if (n == 0) 
        return; 
    print_asterisk(num - n + 1); 
    System.out.println(); 
  
    // recursively calling pattern_lower() 
    pattern_lower(n - 1, num); 
} 
  
// function to print the pattern 
static void pattern(int n, int num) 
{ 
    pattern_upper(n, num); 
    pattern_lower(n - 1, num); 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int n = 5; 
    pattern(n, n); 
} 
}  
  
// This code is contributed by 29AjayKumar 

