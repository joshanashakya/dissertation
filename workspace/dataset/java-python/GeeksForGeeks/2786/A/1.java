

// Java program to print the digital 
// roots of a number 
class GFG 
{ 
      
// Function to return dig-sum 
static int summ(int n) 
{ 
    if (n == 0) 
        return 0; 
    return (n % 9 == 0) ? 9 : (n % 9); 
} 
  
// Function to print the Digital Roots 
static void printDigitalRoot(int n) 
{ 
  
    // store the largest digital roots 
    int maxi = 1; 
    int dig = 1; 
  
    // Iterate till sqrt(n) 
    for (int i = 1; i <= Math.sqrt(n); i++)  
    { 
  
        // if i is a factor 
        if (n % i == 0)  
        { 
            // get the digit sum of both 
            // factors i and n/i 
            int d1 = summ(n / i); 
            int d2 = summ(i); 
  
            // if digit sum is greater 
            // then previous maximum 
            if (d1 > maxi)  
            { 
                dig = n / i; 
                maxi = d1; 
            } 
  
            // if digit sum is greater 
            // then previous maximum 
            if (d2 > maxi)  
            { 
                dig = i; 
                maxi = d2; 
            } 
  
            // if digit sum is same as 
            // then previous maximum, then 
            // check for larger divisor 
            if (d1 == maxi) 
            { 
                if (dig < (n / i)) 
                { 
                    dig = n / i; 
                    maxi = d1; 
                } 
            } 
  
            // if digit sum is same as 
            // then previous maximum, then 
            // check for larger divisor 
            if (d2 == maxi)  
            { 
                if (dig < i)  
                { 
                    dig = i; 
                    maxi = d2; 
                } 
            } 
        } 
    } 
  
    // Print the digital roots 
    System.out.println(dig + " " + maxi); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 10; 
  
    // Function call to print digital roots 
    printDigitalRoot(n); 
} 
} 
// This code is contributed by mits 

