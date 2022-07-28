

# Python program to count number of 
# binary strings without consecutive 1’s 
  
  
  
# Table to store the solution of 
# every sub problem 
memo=[[[-1 for i in range(2)] for j in range(2)] for k in range(32)] 
  
# Function to fill the table 
''' Here, 
pos: keeps track of current position. 
f1: is the flag to check if current 
        number is less than N or not. 
pr: represents the previous digit 
'''
def dp(pos,fl,pr,bin): 
    # Base case 
    if (pos == len(bin)): 
        return 1; 
  
    # Check if this subproblem 
    # has already been solved 
    if (memo[pos][fl][pr] != -1): 
        return memo[pos][fl][pr]; 
  
    val = 0
  
    # Placing 0 at the current position 
    # as it does not violate the condition 
    if (bin[pos] == '0'): 
        val = val + dp(pos + 1, fl, 0, bin) 
  
    # Here flag will be 1 for the 
    # next recursive call 
    elif (bin[pos] == '1'): 
        val = val + dp(pos + 1, 1, 0, bin) 
  
    # Placing 1 at this position only if 
    # the previously inserted number is 0 
    if (pr == 0): 
  
        # If the number is smaller than N 
        if (fl == 1): 
            val += dp(pos + 1, fl, 1, bin) 
  
        # If the digit at current position is 1 
        elif (bin[pos] == '1'): 
            val += dp(pos + 1, fl, 1, bin) 
          
    # Storing the solution to this subproblem 
    memo[pos][fl][pr] = val 
    return val 
  
# Function to find the number of integers 
# less than or equal to N with no 
# consecutive 1’s in binary representation 
def findIntegers(num): 
    # Convert N to binary form 
    bin="" 
  
    # Loop to convert N 
    # from Decimal to binary 
    while (num > 0): 
        if (num % 2): 
            bin += "1"
        else: 
            bin += "0"
        num //= 2
      
    bin=bin[::-1]; 
  
      
  
    # Calling the function 
    return dp(0, 0, 0, bin) 
  
# Driver code 
if __name__ == "__main__": 
  
    N = 12
    print(findIntegers(N)) 

