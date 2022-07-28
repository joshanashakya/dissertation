

# Python program to find maximum number of  
# elements such that their absolute 
# difference is less than or equal to 1 
  
def maxCount(a): 
  
    # Counting frequencies of elements 
    freq = {} 
    for i in range(n): 
        if (a[i] in freq):  
            freq[a[i]] += 1
        else:  
            freq[a[i]] = 1
          
      
    # Finding max sum of adjacent indices     
    ans = 0
    for key, value in freq.items():  
        if (key+1 in freq) :     
            ans = max(ans, freq[key] + freq[key + 1])  
      
    return ans 
      
# Driver Code  
n = 5
arr = [2, 2, 3, 4, 5] 
  
print(maxCount(arr)) 

