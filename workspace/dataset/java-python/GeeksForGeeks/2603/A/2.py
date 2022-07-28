

# Python3 program to find length of 
# period of 1/n without using map or hash  
  
# Function to find length 
# of period in 1/n  
def getPeriod( n) : 
  
    # Find the (n+1)th remainder after  
    # decimal point in value of 1/n  
    rem = 1 # Initialize remainder  
    for i in range(1, n + 2):  
        rem = (10 * rem) % n 
  
    # Store (n+1)th remainder  
    d = rem 
      
    # Count the number of remainders  
    # before next occurrence of  
    # (n+1)'th remainder 'd'  
    count = 0
    rem = (10 * rem) % n 
    count += 1
    while rem != d : 
        rem = (10 * rem) % n 
        count += 1
      
    return count 
  
# Driver Code 
if __name__ == "__main__": 
  
    print (getPeriod(3)) 
    print (getPeriod(7)) 
  
# This code is contributed  
# by ChitraNayal 

