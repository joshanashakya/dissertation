

# Python 3 program to find the number of times 
# pattern p occurred in binary representation 
# on n. 
  
# Function to return the count of occurrence 
# of pat in binary representation of n 
def countPattern(n, pat): 
      
    # To store decimal value of the pattern 
    pattern_int = 0
  
    power_two = 1
  
    # To store a number that has all ones in 
    # its binary representation and length 
    # of ones equal to length of the pattern 
    all_ones = 0
  
    # Find values of pattern_int and all_ones 
    i = len(pat) - 1
    while(i >= 0): 
        current_bit = ord(pat[i]) - ord('0') 
        pattern_int += (power_two * current_bit) 
        all_ones = all_ones + power_two 
        power_two = power_two * 2
        i -= 1
      
    count = 0
    while (n != 0 and n >= pattern_int): 
          
        # If the pattern occurs in the last 
        # digits of n 
        if ((n & all_ones) == pattern_int): 
            count += 1
          
        # Right shift n by 1 bit 
        n = n >> 1
      
    return count 
  
# Driver code 
if __name__ == '__main__': 
    n = 500
    pat = "10"
    print(countPattern(n, pat)) 
  
# This code is contributed by 
# Surendra_Gangwar 

