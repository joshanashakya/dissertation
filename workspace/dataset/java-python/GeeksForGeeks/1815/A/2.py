

# Python3 code to check if a Octal 
# number is Even or Odd 
  
# To return value of a char. 
def val(c): 
    if (ord(c) >= ord('0') and ord(c) <= ord('9')): 
        return ord(c) - ord('0') 
    else: 
        return ord(c) - ord('A') + 10
  
# Function to convert a 
# number from N base to decimal 
def toDeci(str, base): 
    Len = len(str) 
  
    # power of base 
    power = 1
  
    num = 0
  
    # Decimal equivaLent is 
    # str[Len-1]*1 + str[Len-1] * 
    # base + str[Len-1]*(base^2) + ... 
    for i in range(Len-1, -1, -1): 
  
        # A digit in input number 
        # must be less than 
        # number's base 
        if (val(str[i]) >= base): 
  
            print("Invalid Number") 
            return -1
  
        num += val(str[i])*power 
        power = power * base 
  
    return num 
  
# Returns true if n is even, else odd 
def isEven(num, N): 
  
    deci = toDeci(num, N) 
  
    return (deci % 2 == 0) 
  
# Driver code 
if __name__ == '__main__': 
    num = "11A"
    N = 16
  
    if (isEven(num, N)): 
        print("Even") 
    else: 
        print("Odd") 
  
# This code is contributed by mohit kumar 29 

