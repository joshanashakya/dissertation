

# Python program to find the count of  
# all the sub-strings with weight of  
# characters atmost K 
  
# Function to find the count of  
# all the substrings with weight  
# of characters atmost K  
def distinctSubstring(P, Q, K, N):  
  
    # Hashmap to store all substrings  
    S = set() 
  
    # Iterate over all substrings  
    for i in range(0,N):  
  
        # Maintain the sum of all characters  
        # encountered so far  
        sum = 0;  
  
        # Maintain the substring till the  
        # current position  
        s = '' 
  
        for j in range(i,N): 
  
            # Get the position of the  
            # character in string Q  
            pos = ord(P[j]) - 97 
  
            # Add weight to current sum  
            sum = sum + ord(Q[pos]) - 48 
  
            # Add current character to substring  
            s += P[j] 
  
            # If sum of characters is <=K  
            # then insert in into the set  
            if (sum <= K): 
                S.add(s)  
            else: 
                break 
              
    # Finding the size of the set  
    return len(S) 
  
# Driver code  
P = "abcde"
Q = "12345678912345678912345678"
K = 5
N = len(P) 
  
print(distinctSubstring(P, Q, K, N)) 
  
# This code is contributed by Sanjit_Prasad 

