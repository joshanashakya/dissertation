

# Python 3 program to count substrings 
# with recursive sum equal to 9 
  
def count9s(number): 
  
    count = 0 # To store result 
    n = len(number) 
  
    # Consider every character as  
    # beginning of substring 
    for i in range(n): 
          
        # sum of digits in current substring 
        sum = ord(number[i]) - ord('0')      
  
        if (number[i] == '9'): 
            count += 1
  
        # One by one choose every character  
        # as an ending character 
        for j in range(i + 1, n): 
          
            # Add current digit to sum, if  
            # sum becomes multiple of 5 then 
            # increment count. Let us do  
            # modular arithmetic to avoid  
            # overflow for big strings 
            sum = (sum + ord(number[j]) - 
                         ord('0')) % 9
  
            if (sum == 0): 
                count += 1
    return count 
  
# Driver Code 
if __name__ == "__main__": 
      
    print(count9s("4189")) 
    print(count9s("1809")) 
  
# This code is contributed by ita_c 

