

# Python3 program to find minimum number which divide n 
# to make it a perfect cube 
  
# Returns the minimum divisor 
def findMinNumber(n): 
    count = 0; 
    ans = 1; 
  
    # Since 2 is only even prime, compute its 
    # power seprately. 
    while (n % 2 == 0): 
        count+=1; 
        n /= 2; 
      
    # If count is not divisible by 3, 
    # it must be removed by dividing 
    # n by prime number power. 
    if (count % 3 != 0): 
        ans *= pow(2, (count % 3)); 
  
    for i in range(3, int(pow(n, 1/2)), 2): 
        count = 0; 
        while (n % i == 0): 
            count += 1; 
            n /= i; 
          
        # If count is not divisible by 3, 
        # it must be removed by dividing 
        # n by prime number power. 
        if (count % 3 != 0): 
            ans *= pow(i, (count % 3)); 
      
    # if n is a prime number 
    if (n > 2): 
        ans *= n; 
  
    return ans; 
  
# Driver code 
if __name__ == '__main__': 
    n = 128; 
    print(findMinNumber(n)); 
  
# This code is contributed by 29AjayKumar 

