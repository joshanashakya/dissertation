

// Java program to find the  
// largest fraction a/b  
// such that a+b is equal  
// to given number and a < b. 
  
class GFG 
{ 
public static void solve(int n) 
{ 
    // Calculate N/2; 
    double a = n / 2; 
      
    // Check if N is 
    // odd or even 
    if (n % 2 != 0)  
    { 
        // If N is odd answer  
        // will be ceil(n/2)-1  
        // and floor(n/2)+1 
        System.out.println((Math.ceil(a) - 1) +  
                         " " + (Math.floor(a) + 1)); 
    } 
    else
    { 
  
        // If N is even check 
        // if N/2 i.e a  
        // is even or odd 
        if ((int)(a) % 2 == 0)  
        { 
  
            // If N/2 is even apply  
            // the previous formula 
            System.out.println((Math.ceil(a) - 1) +  
                             " " + (Math.floor(a) + 1)); 
        }  
  
        else
        { 
            // If N/2 is odd answer  
            // will be ceil(N/2)-2  
            // and floor(N/2)+2 
            System.out.println((Math.ceil(a) - 2) +  
                             " " + (Math.floor(a) + 2)); 
        } 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 34; 
    solve(n); 
} 
} 
  
// This code is contributed 
// by mits 

