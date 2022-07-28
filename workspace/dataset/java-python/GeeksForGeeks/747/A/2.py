

# Python 3 program to find the count 
# of numbers whose difference with 
# Fibonacci count upto them is atleast K 
  
MAX = 1000005
  
# fibUpto[i] denotes the count of 
# fibonacci numbers upto i 
fibUpto = [0]*(MAX + 1) 
  
# Function to compute all the Fibonacci 
# numbers and update fibUpto array 
def compute(sz): 
  
    isFib = [False]*(sz + 1) 
    # Store the first two Fibonacci numbers 
    prev = 0
    curr = 1
    isFib[prev] = True
    isFib[curr] = True
  
    # Compute the Fibonacci numbers 
    # and store them in isFib array 
    while (curr <=sz): 
        temp = curr + prev 
        if(temp<=sz): 
            isFib[temp] = True
        prev = curr 
        curr = temp 
  
    # Compute fibUpto array 
    fibUpto[0] = 1
    for i in range( 1,sz+1): 
        fibUpto[i] = fibUpto[i - 1] 
        if (isFib[i]): 
            fibUpto[i]+=1
  
# Function to return the count 
# of valid numbers 
def countOfNumbers(N, K): 
  
    # Compute fibUpto array 
    compute(N) 
  
    # Binary search to find the minimum 
    # number that follows the condition 
    low , high, ans = 1, N, 0
    while (low <= high): 
        mid = (low + high) >> 1
  
        # Check if the number is 
        # valid, try to reduce it 
        if (mid - fibUpto[mid] >= K): 
            ans = mid 
            high = mid - 1
        else: 
            low = mid + 1
  
    # Ans is the minimum valid number 
    if(ans): 
        return (N - ans + 1) 
    return 0
      
# Driver Code 
if __name__ == "__main__": 
      
    N = 10
    K = 3
  
    print(countOfNumbers(N, K)) 
  
# This code is contributed by chitranayal 

