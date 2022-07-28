

# Python3 implementation of the above approach  
  
# Function to print the required numbers  
def find(n):  
  
    # Suppose b = n and we want a % b = 0  
    # and also (a / b) < n so a = b * (n - 1)  
    b = n  
    a = b * (n - 1)  
  
    # Special case if n = 1  
    # we get a = 0 so (a * b) < n  
    if a * b > n and a // b < n:  
        print("a = {}, b = {}" . format(a, b))  
      
    # If no pair satisfies the conditions  
    else: 
        print(-1)  
  
# Driver Code 
if __name__ == "__main__":  
  
    n = 10
    find(n)  
  
# This code is contributed by Rituraj Jain 

