

# Python3 implementation of the approach 
  
# Function that returns true if number n  
# is a composite number 
def isComposite(n):  
    
    # Corner cases  
    if (n <= 1):  
        return False
    if (n <= 3):  
        return False
    
    # This is checked so that we can skip   
    # middle five numbers in below loop  
    if (n % 2 == 0 or n % 3 == 0):  
        return True
    i = 5
    while(i * i <= n):  
            
        if (n % i == 0 or n % (i + 2) == 0):  
            return True
        i = i + 6
            
    return False
  
# Function that returns true if the eventual  
# digit sum of number nm is 1 
def isDigitSumOne(nm) : 
      
    # Loop till the sum is not single 
    # digit number 
    while(nm>9) : 
          
        # Intitialize the sum as zero 
        sum_digit = 0
          
        # Find the sum of digits 
        while(nm != 0) : 
            digit = nm % 10
            sum_digit = sum_digit + digit 
            nm = nm // 10
        nm = sum_digit 
      
    # If sum is eventually 1 
    if(nm == 1): 
        return True
    else: 
        return False
          
# Function to print the required numbers  
# from the given range 
def printValidNums(m, n ): 
    for i in range(m, n + 1): 
          
        # If i is one of the required numbers 
        if(isComposite(i) and isDigitSumOne(i)) : 
            print(i, end =" ") 
  
# Driver code 
l = 10
r = 100
printValidNums(m, n) 

