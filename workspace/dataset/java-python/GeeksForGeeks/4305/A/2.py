

# Python Program to print  
# the pattern “GFG” 
import math 
  
# Function to print the 
# pattern "GFG" 
def print1(n, k) : 
  
    for i in range(0, n) : 
        print ("\n") 
        for j in range(0, (3 * k + 2)) : 
            if ((i == 0 and j != k and
  
                # For printing the  
                # upper portion of 
                # the pattern "GFG" 
                j != 2 * k + 1) or
                ((i == math.floor(n / 2)) and
                (j > 1) and (j != k) and
                (j != 2 * k + 1) and
  
                # for printing the 
                # middle portion of 
                # the pattern "GFG"  
                (j != 2 * k + 3)) or
                ((i == n - 1) and (j != k) and
  
                # for printing the 
                # lower portion of 
                # the pattern "GFG" 
                ((j <= k) or (j > 2 * 
                              k + 1)))     or
                (j == 0) or (j == k + 1) or
                (j == (2 * k + 2)) or
                ((j ==k - 1 or j == 3 *
                               k + 1) and
                (i > math.floor(n / 2)))) : 
  
                # printing * where 
                # ever required 
                print ("*", end = "") 
  
            else : 
  
                # printing space  
                # where ever required 
                print (" ", end = "") 
      
# Driver code 
  
# the length of the 
# pattern "GFG" 
n = 7
  
# the width of the 
# pattern "GFG" 
k = 5
  
print1(n, k)  
  
# This code is contributed  
# by Manish Shaw(manishshaw1) 

