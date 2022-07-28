

# Python3 implementation of the approach  
TEN = 10
  
# Function to update the frequency array  
# such that freq[i] stores the  
# frequency of digit i in n  
def updateFreq(n, freq) : 
  
    # While there are digits  
    # left to process  
    while (n) :  
        digit = n % TEN  
  
        # Update the frequency of  
        # the current digit  
        freq[digit] += 1
  
        # Remove the last digit  
        n //= TEN  
  
# Function that returns true if a and b  
# are anagarams of each other  
def areAnagrams(a, b):  
  
    # To store the frequencies of  
    # the digits in a and b  
    freqA = [ 0 ] * TEN  
    freqB = [ 0 ] * TEN 
  
    # Update the frequency of  
    # the digits in a  
    updateFreq(a, freqA)  
  
    # Update the frequency of  
    # the digits in b  
    updateFreq(b, freqB)  
  
    # Match the frequencies of  
    # the common digits  
    for i in range(TEN):  
  
        # If frequency differs for any digit  
        # then the numbers are not  
        # anagrams of each other  
        if (freqA[i] != freqB[i]):  
            return False
              
    return True
  
# Driver code  
a = 240
b = 204
  
if (areAnagrams(a, b)):  
    print("Yes")  
else: 
    print("No")  
  
# This code is contributed by 
# divyamohan123 

