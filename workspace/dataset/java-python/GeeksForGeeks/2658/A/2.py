

# Python3 implementation of the approach ;  
  
# Function to print the largest n-digit even  
# and odd numbers in octal number system  
def findNumbers(N) : 
  
    # Append '7' (N - 1) times  
    ans = '7' * (N - 1) 
  
    # Append '6' for an even number  
    even = ans + '6';  
  
    # Append '7' for an odd number  
    odd = ans + '7';  
  
    print("Even : ", even);  
    print("Odd : ", odd );  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 4;  
  
    findNumbers(n);  
  
# This code is contributed by AnkitRai01 

