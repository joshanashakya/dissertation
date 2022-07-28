

# Python3 program to check if a number is  
# perfect square without finding square root  
  
# from math import sqrt function 
  
  
def isPerfectSquare(n) : 
  
    i = 1
    while(i * i<= n): 
          
        # If (i * i = n) 
        if ((n % i == 0) and (n / i == i)): 
            return True
              
        i = i + 1
    return False
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 36
    if (isPerfectSquare(n)): 
        print("Yes, it is a perfect square.") 
    else : 
        print("No, it is not a perfect square.") 
  
    # This code is contributed by Ryuga 

