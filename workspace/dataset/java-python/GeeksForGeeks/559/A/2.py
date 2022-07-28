

# Python 3 program to find  
# complement of a number 
# with any base b 
  
# Function to find  
# (b-1)'s complement  
def prevComplement(n, b) : 
    maxNum, digits, num = 0, 0, n 
  
    # Calculate number of digits  
    # in the given number  
    while n > 1 : 
        digits += 1
        n = n // 10
  
    # Largest digit in the number  
    # system with base b  
    maxDigit = b - 1
  
    # Largest number in the number  
    # system with base b  
    while digits : 
        maxNum = maxNum * 10 + maxDigit 
        digits -= 1
          
    # return Complement  
    return maxNum - num 
  
# Function to find b's complement 
def complement(n, b) : 
  
    # b's complement = (b-1)'s 
    # complement + 1  
    return prevComplement(n, b) + 1
  
# Driver code 
if __name__ == "__main__" : 
      
    # Function calling 
    print(prevComplement(25, 7)) 
    print(complement(25, 7)) 
  
# This code is contributed  
# by ANKITRAI1 

