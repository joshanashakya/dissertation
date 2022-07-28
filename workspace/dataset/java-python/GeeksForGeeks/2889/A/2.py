

# Python 3 program to find nth number  
# made up of odd digits only 
  
# Function to return nth number made 
# up of odd digits only 
def findNthOddDigitNumber(n) : 
      
    # Variable to keep track of how many 
    # such elements have been found 
    count = 0
      
    i = 1
    while True : 
        num = i 
        isMadeOfOdd = True
          
        # Checking each digit of the number 
        while num != 0 : 
              
            # If 0, 2, 4, 6 or 8 is found 
            # then the number is not made 
            # up of odd digits 
            if (num % 10 == 0 or num % 10 == 2 or 
                num % 10 == 4 or num % 10 == 6 or
                num % 10 == 8) : 
                      
                    isMadeOfOdd = False
                    break
          
            num /= 10
      
        # If the number is made up of 
        # odd digits only 
        if isMadeOfOdd == True : 
            count += 1
      
        # If it is the nth number 
        if count == n : 
            return i 
      
        i += 1
  
# Driver code 
if __name__ == "__main__" : 
      
    n = 10
      
    # Function call 
    print(findNthOddDigitNumber(n)) 
      
# This code is contributed by Ryuga 

