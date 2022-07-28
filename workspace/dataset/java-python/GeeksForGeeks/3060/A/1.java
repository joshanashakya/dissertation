

// Java implementation of the approach  
// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the sum  
// of the digits of num ^ 2 
static int squareDigitSum(String number) 
{ 
    int summ = 0; 
    int num = Integer.parseInt(number); 
      
    // Store the square of num 
    int squareNum = num * num; 
  
    // Find the sum of its digits 
    while(squareNum > 0) 
    { 
        summ = summ + (squareNum % 10); 
        squareNum = squareNum / 10; 
    } 
    return summ; 
}  
  
// Driver code  
public static void main (String[] args) 
{  
    String N = "1111";  
  
    System.out.println(squareDigitSum(N));  
}  
} 
  
// This code is contributed by Rajput-Ji 

