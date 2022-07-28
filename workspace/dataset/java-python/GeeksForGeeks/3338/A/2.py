

# Python3 program to convert the given string  
  
# Function to find the minimum number of  
# operations to convert the given string  
def minOperation(S, N, K):  
  
    # Check if N is divisible by K  
    if N % K:  
        print("Not Possible")  
        return
  
    # Array to store frequency of  
    # characters in given string  
    count = [0] * 26
    for i in range(0, N):  
        count[ord(S[i]) - 97] += 1
  
    E = N // K  
    greaterE = [] 
    lessE = [] 
  
    for i in range(0, 26):  
  
        # Two arrays with number of  
        # operations required  
        if count[i] < E: 
            lessE.append(E - count[i])  
        else: 
            greaterE.append(count[i] - E)  
  
    greaterE.sort()  
    lessE.sort()  
  
    mi = float('inf')  
    for i in range(0, K + 1):  
  
        # Checking for all possibility  
        set1, set2 = i, K - i  
  
        if (len(greaterE) >= set1 and 
            len(lessE) >= set2):  
  
            step1, step2 = 0, 0
  
            for j in range(0, set1):  
                step1 += greaterE[j]  
  
            for j in range(0, set2):  
                step2 += lessE[j]  
  
            mi = min(mi, max(step1, step2)) 
  
    print(mi)  
  
# Driver Code  
if __name__ == "__main__": 
  
    S = "accb"
    N = len(S)  
    K = 2
  
    minOperation(S, N, K)  
      
# This code is contributed by Rituraj Jain 

