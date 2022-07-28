

# Python3 program to find maximum 
# count of such characters which  
# are greater its left and right  
# character in any permutation 
# of the string 
  
# function to find maximum maximal 
# character in the string 
def Solve_1(freq): 
  
    # to store sum of all frequency 
    n = 0
  
    # to store maximum frequency 
    max_freq = 0
  
    # to check if the smallest 
    # element have amximum  
    # frequqncy or not 
    flag = 0
  
    # Iterate in the string  
    # and count frequency 
    for i in range(26) : 
        n += freq[i] 
  
        # to store frequency of  
        # smallest element 
        if (freq[i] != 0 and flag == 0) : 
            first = freq[i] 
            flag = 1
  
        # to store maximum frequency 
        if (max_freq < freq[i]): 
            max_freq = freq[i] 
  
    # if sum of frequency of  
    # all element if 0 
    if (n == 0): 
        return 0
  
    # if frequency of smallest character 
    # if largest frequency 
    if (first != max_freq): 
        flag = 1
    else: 
        flag = 0
  
    return min((n - 1) // 2, n - max_freq - flag) 
  
# Function that counts the  
# frequency of each element 
def solve(s): 
  
    # array to store the frequency  
    # of each character initialize  
    # frequency of all character with 0 
    freq = [0] * 26
  
    # loop to calculate frequqncy of 
    # each character in the given string 
    for i in range(len(s)): 
  
        freq[ord(s[i]) - ord('a')] += 1
  
    print(Solve_1(freq)) 
  
# Driver Code 
if __name__ == "__main__": 
    s = "geeks"
    solve(s) 
  
# This code is contributed  
# by ChitraNayal 

