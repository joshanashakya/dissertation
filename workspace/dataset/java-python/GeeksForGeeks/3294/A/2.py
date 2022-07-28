

# Python3 program for divisibility  
# of number by 999  
  
# function to check divisibility  
def isDivisible999(num): 
    n = len(num); 
    if(n == 0 or num[0] == '0'): 
        return true 
  
    # Append required 0s at the beginning. 
    if((n % 3) == 1): 
        num = "00" + num 
    if((n % 3) == 2): 
        num = "0" + num 
  
    # add digits in group of three in gSum      
    gSum = 0
    for i in range(0, n, 3): 
          
        # group saves 3-digit group  
        group = 0
        group += (ord(num[i]) - 48) * 100
        group += (ord(num[i + 1]) - 48) * 10
        group += (ord(num[i + 2]) - 48) 
        gSum += group 
  
    # calculate result till 3 digit sum      
    if(gSum > 1000): 
        num = str(gSum) 
        n = len(num) 
        gSum = isDivisible999(num) 
    return (gSum == 999)  
  
# Driver code  
if __name__=="__main__": 
    num = "1998"
    n = len(num) 
    if(isDivisible999(num)): 
        print("Divisible") 
    else: 
        print("Not divisible") 
          
# This code is contributed 
# by Sairahul Jella 

