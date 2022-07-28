

# Python3 program to print the smallest 
# integer not less than N with  
# all even digits 
  
# function to check if all digits 
# are even of a given number 
def check_digits(n) : 
      
    # iterate for all digits 
    while (n) :  
          
        # if digit is odd 
        if ((n % 10) % 2) : 
            return 0
  
        n = int(n / 10) 
          
    # all digits are even 
    return 1
  
# function to return the 
# smallest number with  
# all digits even 
def smallest_number(n) : 
      
    # iterate till we find a 
    # number with all digits even 
    for i in range(n, 2401) : 
        if (check_digits(i) == 1) : 
            return (i) 
  
# Driver Code 
N = 2397
print (str(smallest_number(N))) 
  
# This code is contributed by  
# Manish Shaw (manishshaw1) 

