

# Python3 implementation of the approach 
from bisect import bisect_left as lower_bound 
  
MAX = 26
  
# Function to count the number of smaller 
# strings in A for every in B 
def findCount(a, b, n, m): 
  
    # Count the frequency of all characters 
    freq=[0 for i in range(MAX)] 
  
    smallestFreq=[] 
  
    # Iterate for all possible strings in A 
    for i in range(n): 
        s = a[i] 
  
        for i in range(MAX): 
            freq[i]=0
  
        # Increase the frequency of every character 
        for j in range(len(s)): 
            freq[ord(s[j]) - ord('a')]+= 1
  
        # Check for the smallest character's frequency 
        for j in range(MAX): 
  
            # Get the smallest character frequency 
            if (freq[j]): 
  
                # Insert it in the vector 
                smallestFreq.append(freq[j]) 
                break
  
  
    # Sort the count of all the frequency of the smallest 
    # character in every string 
    smallestFreq=sorted(smallestFreq) 
  
    ans=[] 
  
    # Iterate for every in B 
    for i in range(m): 
        s = b[i] 
  
        # Hash set every frequency 0 
        for i in range(MAX): 
            freq[i]=0
  
        # Count the frequency of every character 
        for j in range(len(s)): 
            freq[ord(s[j]) - ord('a')]+= 1
  
  
        frequency = 0
  
        # Find the frequency of the smallest character 
        for j in range(MAX): 
            if (freq[j]): 
                frequency = freq[j] 
                break
  
        # Count the number of strings in A 
        # which has the frequency of the smaller 
        # character less than the frequency of the 
        # smaller character of the in B 
        ind = lower_bound(smallestFreq,frequency) 
  
        # Store the answer 
        ans.append(ind) 
  
    return ans 
  
  
# Function to print the answer 
def printAnswer(a, b, n, m): 
  
    # Get the answer 
    ans = findCount(a, b, n, m) 
  
    # Print the number of strings 
    # for every answer 
    for it in ans: 
        print(it,end=" ") 
  
# Driver code 
  
A = ["aaa", "aa", "bdc"] 
B = ["cccch", "cccd"] 
n = len(A) 
m = len(B) 
  
printAnswer(A, B, n, m) 
  
# This code is contributed by mohit kumar 29 

