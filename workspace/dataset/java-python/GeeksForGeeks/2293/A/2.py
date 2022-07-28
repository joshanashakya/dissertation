

# Python3 program to do Primality test   
# for the sum of digits at   
# odd places of a number 
  
# Function that return sum  
# of the digits at odd places  
def sum_odd(n): 
    sums = 0
    pos = 1 
    while (n!=0): 
        if (pos % 2 == 1): 
            sums += n % 10
        n = n // 10
        pos+=1
    return sums 
  
# Function to check if a  
# number is prime  
  
def check_prime(n): 
    # Corner cases  
    if (n <= 1):  
        return False 
    if (n <= 3):  
        return True
    
     # This is checked so that we can skip  
     # middle five numbers in below loop  
    if (n % 2 == 0 or n % 3 == 0):  
        return False
    
    for i in range(5,n,6):  
        if (n % i == 0 or n % (i + 2) == 0):  
            return False
    return True
  
#driver code 
n = 223
# Get the sum of the  
# digits at odd places  
sums = sum_odd(n) 
if (check_prime(sums)): 
    print("YES")  
else: 
    print("NO") 
  
#this code is improved by sahilshelangia 

