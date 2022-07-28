

# Python 3 program to Check if  
# a large number is 
# divisible by 2, 3 and 5 or not. 
  
# function to return sum of digits of 
# a number 
def SumOfDigits(str, n): 
      
    sum = 0
    for i in range(0,n): 
        sum += int(ord(str[i] )- ord('0')) 
  
    return sum
  
# function to Check if a large number is 
# divisible by 2, 3 and 5 or not 
def Divisible(str, n): 
    if ((SumOfDigits(str, n) % 3 == 0 and 
        str[n - 1] == '0')): 
        return True
  
    return False
  
# Driver code 
if __name__ == "__main__": 
    str = "263730746028908374890"
  
    n = len(str) 
  
    if (Divisible(str, n)): 
        print("YES") 
    else: 
        print("NO") 
          
# this code is contributed by 
# ChitraNayal 

