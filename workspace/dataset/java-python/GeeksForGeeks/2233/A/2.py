

# Python 3 program to print the smallest 
# integer not less than N with all odd digits 
  
# function to return the smallest  
# number with all digits odd 
def smallestNumber(n): 
  
    num = 0
    s = "" 
  
    duplicate = n 
      
    # convert the number to string to 
    # perform operations 
    while (n): 
        s = chr(n % 10 + 48) + s 
        n //= 10
  
    index = -1
  
    # find out the first even number 
    for i in range(len( s)): 
        digit = ord(s[i]) - ord('0') 
        if ((digit & 1) == 0) : 
            index = i 
            break
  
    # if no even numbers are there, 
    # than n is the answer 
    if (index == -1): 
        return duplicate 
  
    # add all digits till first even 
    for i in range( index): 
        num = num * 10 + (ord(s[i]) - 
                          ord('0')) 
  
    # increase the even digit by 1 
    num = num * 10 + (ord(s[index]) - 
                      ord('0') + 1) 
  
    # add 1 to the right of the 
    # even number 
    for i in range(index + 1 , len(s)): 
        num = num * 10 + 1
  
    return num 
  
# Driver Code 
if __name__ == "__main__": 
      
    N = 2397
    print(smallestNumber(N)) 
  
# This code is contributed by ita_c 

