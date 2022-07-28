

// Java implementation of the approach 
class GFG 
{ 
      
// Function that will count 
// total hexadecimal alphabet 
static int countHexadecimal(int L, int R) 
{ 
    int count = 0; 
    for (int i = L; i <= R; i++)  
    { 
  
        // All the numbers from 10 to 15 
        // contain a hexadecimal alphabet 
        if (i >= 10 && i <= 15) 
            count++; 
  
        // If i > 15 then perform mod by 16  
        // repeatedly till the number is > 0 
        // If number % 16 > 10 then increase count 
        else if (i > 15) 
        { 
            int k = i; 
            while (k != 0)  
            { 
                if (k % 16 >= 10) 
                    count++; 
                k = k / 16; 
            } 
        } 
    } 
  
    return count; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int L = 5, R = 100; 
    System.out.print(countHexadecimal(L, R)); 
} 
} 
  
// This code is contributed 
// by Akanksha Rai 

