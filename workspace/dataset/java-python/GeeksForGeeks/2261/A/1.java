

// Java implmentation to find the  
// count of leap years in given 
// range of the year  
class GFG 
{ 
  
// Function to calculate the number 
// of leap years in range of (1, year) 
static int calNum(int year) 
{ 
    return (year / 4) - (year / 100) + 
                        (year / 400); 
} 
  
// Function to calculate the number 
// of leap years in given range 
static void leapNum(int l, int r) 
{ 
    l--; 
    int num1 = calNum(r); 
    int num2 = calNum(l); 
    System.out.print(num1 - num2 +"\n"); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int l1 = 1, r1 = 400; 
    leapNum(l1, r1); 
  
    int l2 = 400, r2 = 2000; 
    leapNum(l2, r2); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

