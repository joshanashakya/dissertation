

# Python3 implementation of  
# Trial Division Algorithm 
  
# Function to check if a number is 
# a prime number or not  
def TrialDivision(N): 
  
    # Initializing with the value 2  
    # from where the number is checked 
    i = 2
  
    # Computing the square root of  
    # the number N 
    k = int(N ** 0.5) 
  
    # While loop till the  
    # square root of N 
    while(i<= k): 
  
        # If any of the numbers between  
        # [2, sqrt(N)] is a factor of N  
        # Then the number is composite 
        if(N % i == 0): 
            return 0
        i += 1
  
    # If none of the numbers is a factor, 
    # then it is a prime number 
    return 1
      
# Driver code 
if __name__ == "__main__": 
    N = 49
    p = TrialDivision(N) 
  
# To check if a number is a prime or not 
    if(p): 
        print("Prime") 
    else: 
        print("Composite") 
         

