

# Python3 code to check if a given  
# number is Triperfect or not  
  
# Returns true if n is Triperfect  
def isTriPerfect( n ):  
      
    # To store sum of divisors.  
    # Adding 1 and n since they are divisors of n. 
    sum = 1 + n 
      
    # Find all divisors and add them  
    i = 2
    while i * i <= n:  
        if n % i == 0:  
            if n / i == i: 
                sum = sum + i 
            else: 
                sum = sum + i + n / i  
        i += 1
      
    # If sum of divisors is equal to  
    # 3 * n, then n is a Triperfect number  
    return (True if sum == 3 * n and n != 1 else False)  
  
# Driver program  
n = 120
  
if isTriPerfect (n):  
    print(n, "is a Triperfect number")  
            

