

# Python3 implementation to check whether  
# decimal representation of given binary  
# number is divisible by 5 or not 
  
# function to return equivalent base 4  
# number of the given binary number  
def equivalentBase4(bin): 
    if(bin == "00"): 
        return 0
    if(bin == "01"): 
        return 1
    if(bin == "10"): 
        return 2
    if(bin == "11"): 
        return 3
      
# function to check whether the given  
# binary number is divisible by 5 or not      
def isDivisibleBy5(bin): 
    l = len(bin) 
    if((l % 2) == 1): 
          
    # add '0' in the beginning to  
    # make length an even number      
        bin = '0' + bin
          
    # to store sum of digits at odd  
    # and even places respectively  
    odd_sum = 0
    even_sum = 0
    isOddDigit = 1
    for i in range(0, len(bin), 2): 
          
        # if digit of base 4 is at odd place,  
        # then add it to odd_sum  
        if(isOddDigit): 
            odd_sum += equivalentBase4(bin[i:i + 2]) 
              
        # else digit of base 4 is at 
        # even place, add it to even_sum      
        else: 
            even_sum += equivalentBase4(bin[i:i + 2]) 
              
        isOddDigit = isOddDigit ^ 1
  
    # if this diff is divisible by 11(which is  
    # 5 in decimal) then, the binary number is 
    # divisible by 5  
    if(abs(odd_sum - even_sum) % 5 == 0): 
        return "Yes"
    else: 
        return "No"
  
# Driver Code 
if __name__=="__main__": 
    bin = "10000101001"
    print(isDivisibleBy5(bin)) 
  
# This code is contributed  
# by Sairahul Jella  

