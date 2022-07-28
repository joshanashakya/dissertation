

# Python3 program to find last five digits 
# of a five digit number raised to power five 
  
# Function to find the last five digits 
# of a five digit number raised to power five 
def lastFiveDigits(n): 
    n = ((int)(n / 10000) * 10000 + 
        ((int)(n / 100) % 10) * 1000 + (n % 10) * 100 +
        ((int)(n / 10) % 10) * 10 + (int)(n / 1000) % 10) 
    ans = 1
    for i in range(5): 
        ans *= n 
        ans %= 100000
    print(ans) 
  
# Driver code 
if __name__ == '__main__': 
    n = 12345
  
    lastFiveDigits(n) 
  
# This code contributed by PrinciRaj1992  

