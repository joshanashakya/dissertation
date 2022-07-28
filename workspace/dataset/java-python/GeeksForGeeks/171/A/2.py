

# Python 3 implementation to check the  
# number is divisible by 75 or not 
  
# check divisibleBy3 
def divisibleBy3(number): 
      
    # to store sum of Digit 
    sumOfDigit = 0
  
    # traversing through each digit 
    for i in range(0, len(number), 1): 
          
        # summing up Digit 
        sumOfDigit += ord(number[i]) - ord('0') 
  
    # check if sumOfDigit is divisibleBy3 
    if (sumOfDigit % 3 == 0): 
        return True
  
    return False
  
# check divisibleBy25 
def divisibleBy25(number): 
      
    # if a single digit number 
    if (len(number) < 2): 
        return False
  
    # length of the number 
    length = len(number) 
  
    # taking the last two digit 
    lastTwo = ((ord(number[length - 2]) - 
                ord('0')) * 10 + 
               (ord(number[length - 1]) - ord('0'))) 
  
    # checking if the lastTwo digit  
    # is divisibleBy25 
    if (lastTwo % 25 == 0): 
        return True
  
    return False
  
# Function to check divisibleBy75 or not 
def divisibleBy75(number): 
      
    # check if divisibleBy3 and divisibleBy25 
    if (divisibleBy3(number) and 
        divisibleBy25(number)): 
        return True
  
    return False
  
# Driver Code 
if __name__ == '__main__': 
    number = "754586672150"
  
    # divisible 
    divisible = divisibleBy75(number) 
  
    # if divisibleBy75 
    if (divisible): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by  
# Surendra_Gangwar 

