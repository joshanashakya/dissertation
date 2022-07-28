

# Python3 implementation of above approach 
  
  
# For calculation of a^b 
def modExp( a, b): 
  
    result = 1
    while (b > 0):  
        if (int(b) & 1): 
            result = result * a 
        a = a * a 
        b /= 2
      
  
    return result 
  
  
# Function to check 
def check( num): 
  
    # every odd and number less than 3. 
    if (num & 1 or num < 3): 
        return -1
  
    # every number divisible by 4. 
    elif (num % 4 == 0): 
        return modExp(num / 4, 4) 
  
    # every number divisible by 6. 
    elif (num % 6 == 0): 
        return modExp(num / 3, 2) * modExp(num / 6, 2) 
  
    # every number divisible by 10. 
    elif (num % 10 == 0): 
        return modExp(num / 5, 2) * (num / 10) * (num / 2) 
  
    # for every even number which is not 
    # divisible by above values. 
    else: 
        return -1
  
  
# Driver code 
if __name__=='__main__': 
    num = 10
    print(int(check(num))) 
  
# This code is contributed by ash264 

