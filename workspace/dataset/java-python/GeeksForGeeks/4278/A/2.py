

# python program to find least value of 
# k for which R(k) is divisible by n 
  
# To find least value of k 
def repUnitValue(n): 
      
    # To check n is coprime or not 
    if (n % 2 == 0 or n % 5 == 0): 
        return 0
  
    # to store R(k) mod n and 10^k 
    # mod n value 
    rem = 1
    power = 1
    k = 1
    while (rem % n != 0): 
          
        k += 1
        power = power * 10 % n 
        rem = (rem + power) % n 
      
    return k 
      
# Driver code 
n = 13
print(repUnitValue(n)) 
  
# This code is contributed by Sam007. 

