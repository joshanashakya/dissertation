

# Python 3 program to count 
# all rotation divisible 
# by 4. 
  
# Returns count of all 
# rotations divisible 
# by 4 
def countRotations(n) : 
  
    l = len(n) 
  
    # For single digit number 
    if (l == 1) : 
        oneDigit = (int)(n[0]) 
          
        if (oneDigit % 4 == 0) : 
            return 1
        return 0
      
      
    # At-least 2 digit number 
    # (considering all pairs) 
    count = 0
    for i in range(0, l - 1) : 
        twoDigit = (int)(n[i]) * 10 + (int)(n[i + 1]) 
          
        if (twoDigit % 4 == 0) : 
            count = count + 1
              
    # Considering the number 
    # formed by the pair of 
    # last digit and 1st digit 
    twoDigit = (int)(n[l - 1]) * 10 + (int)(n[0]) 
    if (twoDigit % 4 == 0) : 
        count = count + 1
  
    return count 
  
# Driver program 
n = "4834"
print("Rotations: " , 
    countRotations(n)) 
  
# This code is contributed by Nikita tiwari. 

