

# Python3 implementation of the approach  
  
# Function to return the count  
# of required numbers  
def countNumbers(l, r) : 
  
    # Count of numbers in range  
    # which are divisible by 6  
    return ((r // 6) - (l - 1) // 6);  
  
# Driver code  
if __name__ == "__main__" : 
  
    l = 1000; r = 6000;  
    print(countNumbers(l, r));  
  
# This code is contributed by Ryuga 

