

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{     
// Function to return the maximum 
// number of people that can be killed 
static int maxPeople(int p) 
{ 
    int tmp = 0, count = 0; 
  
    // Loop will break when the ith person 
    // cannot be killed 
    for (int i = 1; i * i <= p; i++)  
    { 
        tmp = tmp + (i * i); 
        if (tmp <= p) 
            count++; 
        else
            break; 
    } 
    return count; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int p = 14; 
    System.out.println(maxPeople(p)); 
  
} 
} 
  
// This code is contributed by Arnab Kundu 

