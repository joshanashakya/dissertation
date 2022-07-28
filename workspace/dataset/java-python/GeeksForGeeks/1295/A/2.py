

# Python3 implementation of the approach 
  
# Function to find two composite 
# numbers which when added 
# give sum as n 
def findNums(n): 
  
    # Only 8 and 10 can be represented 
    # as the sum of two composite integers 
    if (n <= 11): 
        if (n == 8): 
            print("4 4", end = " ") 
        if (n == 10): 
            print("4 6", end = " ") 
        else: 
            print("-1", end = " ") 
  
    # If n is even 
    if (n % 2 == 0): 
        print("4 ", (n - 4), end = " ") 
  
    # If n is odd 
    else: 
        print("9 ", n - 9, end = " ") 
  
# Driver code 
n = 13
  
findNums(n) 
  
# This code is contributed by Mohit Kumar 

