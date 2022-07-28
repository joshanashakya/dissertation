

# Python3 program to check if  
# the first and last digit of number N 
# is prime and their sum is less than K 
  
# Get the First digit of the number 
def first(n): 
    a = n 
    c = 1
    while (a != 0): 
        a //= 10
        c = c * 10
  
    c = c // 10
    fi = n // c 
    return fi 
  
# Check if the digit is prime or not 
def prime(n): 
    if n in [2, 3, 5, 7]: 
        return True
    else: 
        return False
  
# Function to Check if the first 
# and last digit of number N is prime 
# and their sum is less than K 
def check(n, k): 
  
    # Last digit of the number 
    l = n % 10
  
    # First digit of number 
    f = first(n) 
  
    # Check if these are prime 
    lp = prime(l) 
    fp = prime(f) 
  
    # If they are prime 
    if (lp and fp): 
  
        # Check if they are less than k or not 
        if (l + f < k): 
            print("Yes") 
        else: 
            print("No") 
    else: 
        print("No") 
  
# Driver code 
  
# Test case 1 
n = 322223
k = 10
  
check(n, k) 
  
# Test case 2 
n = 62531561
k = 15
  
check(n, k) 
  
# This code is contributed by Mohit kumar 

