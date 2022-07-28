

// Java implementation of above approach 
import java.io.*; 
import java.util.*; 
import java.lang.*; 
  
class GFG 
{ 
// For calculation of a^b 
static int modExp(int a, int b) 
{ 
    int result = 1; 
    while (b > 0)  
    { 
        if (b == 1) 
            result = result * a; 
        a = a * a; 
        b /= 2; 
    } 
  
    return result; 
} 
  
// Function to check 
static int check(int num) 
{ 
    // every odd and number less than 3. 
    if (num == 1 || num < 3) 
        return -1; 
  
    // every number divisible by 4. 
    else if (num % 4 == 0) 
        return modExp(num / 4, 4); 
  
    // every number divisible by 6. 
    else if (num % 6 == 0) 
        return modExp(num / 3, 2) * modExp(num / 6, 2); 
  
    // every number divisible by 10. 
    else if (num % 10 == 0) 
        return modExp(num / 5, 2) * (num / 10) * (num / 2); 
  
    // for every even number which is not 
    // divisible by above values. 
    else
        return -1; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int num = 10; 
    System.out.print(check(num)); 
} 
} 
  
// This code is contributed  
// by Akanksha Rai(Abby_akku) 

