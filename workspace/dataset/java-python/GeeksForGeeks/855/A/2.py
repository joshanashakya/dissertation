

# Python3 implementation of above approach 
  
# function to return set bits count 
def bitsoncount(x): 
    return bin(x).count('1') 
  
# Function to find the count of numbers  
# which are multiple of its set bits count  
def find_count(arr) : 
    # variable to store count  
    ans = 0 
  
    # iterate over elements of array  
    for i in arr : 
  
        # Get the set-bits count of each element  
        x = bitsoncount(i) 
  
        # Check if the setbits count  
        # divides the integer i  
        if (i % x == 0): 
  
            # Increment the count  
            # of required numbers by 1  
            ans += 1
  
    return ans 
  
# Driver code  
arr = [ 1, 2, 3, 4, 5, 6 ] 
  
print(find_count(arr)) 
  
# This code is contributed by Sanjit_Prasad 

