

# Python3 program to perform Q queries to find  
# longest subsequence whose average is less than K  
import bisect 
  
# Function to print the length for evey query  
def longestSubsequence(a, n, q, m):  
   
    # sort array of N elements  
    a.sort()  
    Sum = 0 
  
    # Array to store average from left  
    b = [None] * n  
  
    for i in range(0, n):   
        Sum += a[i]  
        av = Sum // (i + 1)  
        b[i] = av + 1 
  
    # Sort array of average  
    b.sort()  
  
    # number of queries  
  
    for i in range(0, m):   
        k = q[i]  
  
        # print answer to every query  
        # using binary search  
        longest = bisect.bisect_right(b, k)  
  
        print("Answer to Query", i + 1, ":", longest) 
  
# Driver Code  
if __name__ == "__main__": 
   
    a = [1, 3, 2, 5, 4]   
    n = len(a)  
  
    # 4 queries  
    q = [4, 2, 1, 5]   
    m = len(q) 
  
    longestSubsequence(a, n, q, m)  
      
# This code is contributed by Rituraj Jain 

