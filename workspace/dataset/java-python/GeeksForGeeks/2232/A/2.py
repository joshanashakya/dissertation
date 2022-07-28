

# Python 3 program to print the smallest 
# integer not less than N with all odd digits 
  
# function to check if all digits 
# are odd of a given number 
def check_digits(n): 
      
    # iterate for all digits 
    while (n): 
          
        # if digit is even 
        if ((n % 10) % 2 == 0): 
            return 0
  
        n = int(n / 10) 
  
    # all digits are odd 
    return 1
  
# function to return the smallest  
# number with all digits odd 
def smallest_number(n): 
      
    # iterate till we find a 
    # number with all digits odd 
    i = n 
    while(1): 
        if (check_digits(i)): 
            return i 
  
        i += 1
  
# Driver Code 
if __name__ == '__main__': 
    N = 2397
    print(smallest_number(N)) 
  
# This code is contributed by 
# Sanjit_Prasad 

