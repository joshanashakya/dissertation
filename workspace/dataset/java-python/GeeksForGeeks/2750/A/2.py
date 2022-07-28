

# Python 3 program to count number of substring 
# which are even integer in a string of digits. 
  
  
# Return the even number substrings. 
def evenNumSubstring(str): 
    length = len(str) 
    count = 0
  
    for i in range(0,length,1): 
        temp = ord(str[i]) - ord('0') 
  
        # If current digit is even, add 
        # count of substrings ending with 
        # it. The count is (i+1) 
        if (temp % 2 == 0): 
            count += (i + 1) 
  
    return count 
  
# Driven Program 
if __name__ == '__main__': 
    str = ['1','2','3','4'] 
    print(evenNumSubstring(str)) 
  
# This code is contributed by 
# Surendra_Gangwar 

