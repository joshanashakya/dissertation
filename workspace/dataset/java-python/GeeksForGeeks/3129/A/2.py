

# Python implementation to check if the 
# product of digit sum and its  
# reverse equals the number or not 
  
  
# Function that returns number after  
# performing operations. 
def check(num) : 
    digitSum = 0
      
    # loop used to count digit sum 
    # of numbers. 
    while(num != 0) : 
        digitSum = digitSum + num % 10
        num = num // 10
      
    temp = (int)(digitSum) 
    reverseDigitSum = 0
            
    # loop that reverse digit sum. 
    while(temp != 0) : 
        rem = temp % 10
        reverseDigitSum = reverseDigitSum * 10 + rem 
        temp = temp / 10
              
    # product of digit sum and reverse digit 
    # sum and assign it to number variables. 
    number = digitSum * reverseDigitSum 
    return number 
      
# Driver function 
num = 1729
  
# call check() function. 
x = (check(num)) 
  
# check if original number   
# equals to x or not 
if (num == x) : 
    print("Yes") 
else : 
    print("No") 
      
      
# This code is contributed by Nikita Tiwari. 

