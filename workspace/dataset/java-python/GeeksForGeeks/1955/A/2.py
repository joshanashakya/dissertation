

# Python3 implementation of the approach 
  
# Function to return the count 
# of the required numbers 
def countNums(l, r) : 
    cnt = 0; 
  
    for i in range(l, r + 1) : 
  
        # Last digit of the current number 
        lastDigit = (i % 10); 
  
        # If the last digit is equal to 
        # any of the given digits 
        if ((lastDigit % 10) == 2 or (lastDigit % 10) == 3
            or (lastDigit % 10) == 9) : 
          
            cnt += 1; 
  
    return cnt; 
  
# Driver code 
if __name__ == "__main__" :  
      
    l = 11; r = 33; 
      
    print(countNums(l, r)) ; 
  
# This code is contributed by AnkitRai01 

