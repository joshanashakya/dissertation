

# Python3 implementation to find the 
# maximum occurence of the subsequence 
# such that the indices of characters 
# are in arithmetic progression 
  
# Function to find the 
# maximum occurence of the subsequence 
# such that the indices of characters 
# are in arithmetic progression 
def maximumOccurrence(s): 
    n = len(s) 
  
    # Frequencies of subsequence 
    freq = {} 
  
    # Loop to find the frequencies 
    # of subsequence of length 1 
    for i in s: 
        temp = "" 
        temp += i 
        freq[temp] = freq.get(temp, 0) + 1
  
    # Loop to find the frequencies 
    # subsequence of length 2 
    for i in range(n): 
        for j in range(i + 1, n): 
            temp = "" 
            temp += s[i] 
            temp += s[j] 
            freq[temp] = freq.get(temp, 0) + 1
  
    answer = -10**9
  
    # Finding maximum frequency 
    for it in freq: 
        answer = max(answer, freq[it]) 
    return answer 
  
# Driver Code 
if __name__ == '__main__': 
    s = "xxxyy"
  
    print(maximumOccurrence(s)) 
  
# This code is contributed by mohit kumar 29 

