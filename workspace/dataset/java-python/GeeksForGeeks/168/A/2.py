

# Python 3 code to check divisibility  
# of a given large number by 7 
  
def isdivisible7(num): 
    n = len(num) 
    if (n == 0 and num[0] == '\n'): 
        return 1
  
    # Append required 0s at the beginning. 
    if (n % 3 == 1) : 
        num = str(num) + "00"
        n += 2
      
    elif (n % 3 == 2) : 
        num = str(num) + "0"
        n += 1
  
    # add digits in group of three in gSum 
    GSum = 0
    p = 1
    for i in range(n - 1, -1, -1) : 
  
        # group saves 3-digit group 
        group = 0
        group += ord(num[i]) - ord('0') 
        i -= 1
        group += (ord(num[i]) - ord('0')) * 10
        i -= 1
        group += (ord(num[i]) - ord('0')) * 100
  
        GSum = GSum + group * p 
  
        # generate alternate series of  
        # plus and minus 
        p *= (-1) 
  
    return (GSum % 7 == 0) 
  
# Driver code 
if __name__ == "__main__": 
      
    num = "8955795758"
    if (isdivisible7(num)): 
        print("Divisible by 7") 
    else : 
        print("Not Divisible by 7") 
  
# This code is contributed by ChitraNayal 

