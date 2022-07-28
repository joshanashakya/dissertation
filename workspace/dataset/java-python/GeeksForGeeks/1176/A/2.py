

# Python3 implementation to check whether  
# bitwise OR of n numbers is even or odd  
  
# Function to check if bitwise OR  
# of n numbers is even or odd  
def check(arr,n): 
    for i in range(n): 
  
        # if at least one odd number is found,  
        # then the bitwise OR of all numbers  
        # will be odd  
        if arr[i] & 1: 
            return True
  
    # Bitwise OR is an odd number  
    return False
  
# Driver code 
if __name__=='__main__': 
    arr = [3, 9, 12, 13, 15] 
    n = len(arr) 
    if check(arr,n): 
        print("Odd Bit-wise OR") 
    else: 
        print("Even Bit-wise OR")  
  
# This code is contributed by  
# Shrikant13 

