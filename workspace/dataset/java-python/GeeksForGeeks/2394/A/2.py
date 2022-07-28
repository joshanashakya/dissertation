

# Python 3 program to print the largest  
# integer not greater than N with all  
# odd digits 
  
# Function to check if all digits 
# of a number are odd 
def allOddDigits(n): 
      
    # iterate for all digits 
    while (n): 
  
        # if digit is even 
        if ((n % 10) % 2 == 0): 
            return False
        n = int(n / 10) 
  
    # all digits are odd 
    return True
  
# function to return the largest  
# number with all digits odd 
def largestNumber(n): 
    if (n % 2 == 0): 
        n -= 1
  
    # iterate till we find a 
    # number with all digits odd 
    i = n 
    while(1): 
        if (allOddDigits(i)): 
            return i 
        i -= 2
  
# Driver Code 
if __name__ =='__main__': 
    N = 23
    print(largestNumber(N)) 
      
# This code is contributed by 
# Shashank_Sharma 

