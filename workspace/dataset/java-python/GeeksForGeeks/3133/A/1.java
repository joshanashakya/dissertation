

// Java program to reverse digits of a number 
  
// Recursive function to  
// reverse digits of num 
class GFG 
{ 
static int rev_num = 0; 
static int base_pos = 1; 
static int reversDigits(int num) 
{ 
    if(num > 0) 
    { 
        reversDigits(num / 10); 
        rev_num += (num % 10) * base_pos; 
        base_pos *= 10; 
    } 
return rev_num; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int num = 4562; 
    System.out.println(reversDigits(num)); 
} 
} 
  
// This code is contributed by mits 

