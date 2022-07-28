

# Python 3 program to find the length 
# of longest subsequence of 
# Fibonacci Numbers in an Array 
  
N = 100005
  
# Function to create hash table 
# to check Fibonacci numbers 
def createHash(hash,maxElement): 
    prev = 0
    curr = 1
    hash.add(prev) 
    hash.add(curr) 
  
    while (curr <= maxElement): 
        temp = curr + prev 
        hash.add(temp) 
        prev = curr 
        curr = temp 
      
# Function to find the longest 
# subsequence containing 
# all Fibonacci numbers 
def longestFibonacciSubsequence(arr, n): 
    hash = set() 
    createHash(hash,max(arr)) 
  
    answer = 0
  
    for i in range(n): 
        if (arr[i] in hash): 
            answer += 1
  
    return answer 
  
# Driver code 
if __name__ == '__main__': 
    arr = [3, 4, 11, 2, 9, 21] 
    n = len(arr) 
  
    # Function call 
    print(longestFibonacciSubsequence(arr, n)) 
  
# This code is contributed by Surendra_Gangwar 

