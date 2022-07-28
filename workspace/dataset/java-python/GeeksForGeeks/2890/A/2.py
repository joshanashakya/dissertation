

# Simple Python3 program to find nth  
# number made of even digits only 
  
# function to calculate nth number  
# made of even digits only 
def findNthEvenDigitNumber(n): 
  
    # variable to note how many such  
    # numbers have been found till now 
    count = 0; 
    i = 0; 
    while (True): 
      
        curr = i; 
  
        # bool variable to check if  
        # 1, 3, 5, 7, 9 is there or not 
        isCurrEvenDigit = True; 
  
        # checking each digit of the number 
        while (curr != 0): 
              
            # If 1, 3, 5, 7, 9 is found 
            # temp is changed to false 
            if (curr % 10 == 1 or curr % 10 == 3 or
                curr % 10 == 5 or curr % 10 == 7 or
                curr % 10 == 9): 
                isCurrEvenDigit = False; 
            curr = curr // 10; 
  
        # temp is true it means that it 
        # does not have 1, 3, 5, 7, 9 
        if (isCurrEvenDigit == True): 
            count += 1; 
  
        # If nth such number is found, 
        # return it 
        if (count == n): 
            return i; 
          
        i += 1; 
  
# Driver Code 
print(findNthEvenDigitNumber(2)); 
print(findNthEvenDigitNumber(10)); 
  
# This code is contributed by mits 

