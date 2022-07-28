

# Python3 program to print the largest 
# integer not greater than N with  
# all even digits 
  
# function to check if all digits 
# are even of a given number 
def checkDigits(n): 
  
      
    # iterate for all digits 
    while (n>0):  
        # if digit is odd 
        if ((n % 10) % 2):  
            return False; 
  
        n =int(n/10); 
  
    # all digits are even 
    return True; 
  
# function to return the 
# largest number with 
# all digits even 
def largestNumber(n): 
      
    # Iterate till we find a 
    # number with all digits even 
    for i in range(n,-1,-1): 
        if (checkDigits(i)): 
            return i; 
  
# Driver Code 
N = 23;  
print(largestNumber(N)); 
  
# This code is contributed by mits 

