

# Python3 implementation of above approach 
  
# Function to find 
# digit count of numbers 
def digit_count(x): 
    sum = 0
    while (x): 
        sum += 1
        x = x // 10
    return sum
  
# Function to find the count of numbers 
def find_count(arr,k): 
    ans = 0
    for i in arr: 
        # Get the digit count of each element 
        x = digit_count(i) 
  
        # Check if the digit count 
        # is divisible by K 
        if (x % k == 0): 
            # Increment the count 
            # of required numbers by 1 
            ans += 1
  
    return ans 
  
# Driver code 
if __name__ == '__main__': 
    arr  =  [12, 345, 2, 68, 7896] 
    K = 2
  
    print(find_count(arr, K)) 
  
# This code is contributed by Surendra_Gangwar 

