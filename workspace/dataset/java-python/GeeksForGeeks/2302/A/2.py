

# Python3 program to find the number  
# of ways in which the characters  
# of the word can be arranged such  
# that the vowels occupy only the  
# odd positions 
import math 
  
# Function to return the factorial 
# of a number 
def fact(n): 
    f = 1; 
    for i in range(2, n + 1): 
        f = f * i; 
  
    return f; 
  
# calculating nPr 
def npr(n, r): 
    return fact(n) / fact(n - r); 
  
# Function to find the number of  
# ways in which the characters of  
# the word can be arranged such  
# that the vowels occupy only the  
# odd positions 
def countPermutations(str): 
  
    # Get total even positions 
    even = math.floor(len(str) / 2); 
  
    # Get total odd positions 
    odd = len(str) - even; 
  
    ways = 0; 
  
    # Store frequency of each  
    # character of the string 
    freq = [0] * 26; 
    for i in range(len(str)): 
        freq[ord(str[i]) - ord('a')] += 1; 
  
    # Count total number of vowels 
    nvowels = (freq[0] + freq[4] + freq[8] + 
               freq[14] + freq[20]); 
  
    # Count total number of consonants 
    nconsonants = len(str) - nvowels; 
  
    # Calculate the total number of ways 
    ways = (npr(odd, nvowels) * 
            npr(nconsonants, nconsonants)); 
  
    return int(ways); 
  
# Driver code 
str = "geeks"; 
  
print(countPermutations(str)); 
      
# This code is contributed by mits 

