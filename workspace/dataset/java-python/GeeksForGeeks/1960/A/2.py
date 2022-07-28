

# Python3 implementation of the approach 
  
# Function to return the binary 
# representation of n 
def decToBinary(n): 
      
    # Array to store binary representation 
    binaryNum = [0 for i in range(32)] 
  
    # Counter for binary array 
    i = 0
    while (n > 0): 
  
        # Storing remainder in binary array 
        binaryNum[i] = n % 2
        n = n // 2
        i += 1
  
    # To store the binary representation 
    # as a string 
    binary = "" 
    for j in range(i - 1, -1, -1): 
        binary += str(binaryNum[j]) 
  
    return binary 
  
# Function to return the frequency of 
# pat in the given txt 
def countFreq(pat, txt): 
    M = len(pat) 
    N = len(txt) 
    res = 0
  
    # A loop to slide pat[] one by one 
    for i in range(N - M + 1): 
          
        # For current index i, check for 
        # pattern match 
        j = 0
        while(j < M): 
            if (txt[i + j] != pat[j]): 
                break
            j += 1 
  
        # If pat[0...M-1] = txt[i, i+1, ...i+M-1] 
        if (j == M): 
            res += 1
            j = 0
  
    return res 
  
# Function to find the occurrence of 
# the given pattern in the binary 
# representation of elements of arr[] 
def findOccurrence(arr, n, pattern): 
  
    # For every element of the array 
    for i in range(n): 
  
        # Find its binary representation 
        binary = decToBinary(arr[i]) 
  
        # Print the occurrence of the given pattern 
        # in its binary representation 
        print(countFreq(pattern, binary), end = " ") 
  
# Driver code 
arr = [5, 106, 7, 8] 
pattern = "10"
n = len(arr) 
  
findOccurrence(arr, n, pattern) 
  
# This code is contributed by Mohit Kumar 

