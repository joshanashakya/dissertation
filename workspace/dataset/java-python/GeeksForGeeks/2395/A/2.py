

# Python3 program to print the largest integer 
# not greater than N with all odd digits 
  
# function to return the largest number 
# with all digits odd 
def largestNumber(n): 
  
    s = "" 
    duplicate = n 
  
    # convert the number to a string for 
    # easy operations 
    while (n): 
        s = chr(n % 10 + 48) + s 
        n //= 10
  
    index = -1
  
    # find first even digit 
    for i in range(len(s)): 
        if (((ord(s[i]) -
              ord('0')) % 2 & 1) == 0): 
            index = i 
            break
          
    # if no even digit, then N is the answer 
    if (index == -1): 
        return duplicate 
  
    num = 0
  
    # till first even digit, 
    # add all odd numbers 
    for i in range(index): 
        num = num * 10 + (ord(s[i]) - ord('0')) 
  
    # decrease 1 from the even digit 
    num = num * 10 + (ord(s[index]) - 
                      ord('0') - 1) 
  
    # add 9 in the rest of the digits 
    for i in range(index + 1, len(s)): 
        num = num * 10 + 9
  
    return num 
  
# Driver Code 
N = 24578
print(largestNumber(N)) 
  
# This code is contributed by mohit kumar 

