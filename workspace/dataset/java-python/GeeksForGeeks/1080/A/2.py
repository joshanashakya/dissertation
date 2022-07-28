

# Python3 program to check if two numbers 
# can be made equal by increasing 
# the first by a and decreasing 
# the second by b 
  
# Function to whether the numbers 
# can be made equal or not 
def checkEqualNo(m, n, a, b) : 
    if (m <= n) : 
  
        # Check whether the numbers can reach 
        # an equal point or not 
        if ((n - m) % (a + b) == 0) : 
            return True; 
      
        else : 
            return False; 
          
    else : 
  
        # M and N cannot be made equal by 
        # increasing M and decreasing N when 
        # M is already greater than N 
        return False; 
      
# Driver code 
if __name__ == "__main__" : 
  
    M = 2; N = 8; 
    A = 3; B = 3; 
  
    if (checkEqualNo(M, N, A, B)) : 
        print("Yes"); 
    else : 
        print("No"); 
  
# This code is contributed by Yash_R 

