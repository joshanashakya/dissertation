

// Java program to print the smallest 
// integer not less than N with all odd digits 
class Geeks { 
  
// function to check if all digits 
// are odd of a given number 
static int check_digits(int n) 
{ 
    // iterate for all digits 
    while (n > 0) { 
        if ((n % 10) % 2 == 0) // if digit is even 
            return 0; 
  
        n /= 10; 
    } 
  
    // all digits are odd 
    return 1; 
} 
  
// function to return the smallest number 
// with all digits odd 
static int smallest_number(int n) 
{ 
    // iterate till we find a 
    // number with all digits odd 
    for (int i = n;; i++) 
        if (check_digits(i) > 0) 
            return i; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int N = 2397; 
    System.out.println(smallest_number(N)); 
} 
} 
  
// This code is contributed by Kirti_Mangal 

