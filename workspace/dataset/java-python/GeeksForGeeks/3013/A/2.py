

# Python3 implementation of the approach 
  
# Function to return the required number 
def getNumber(s): 
  
    number_of_digits = len(s); 
  
    freq=[0]*10; 
  
    # Count the frequency of each digit 
    for i in range(number_of_digits): 
        if (s[i] == '1'    or s[i] == '2' or s[i] == '3' or s[i] == '5' or s[i] == '7'): 
            freq[ord(s[i]) - 48] += 1; 
  
        # 4! can be expressed as 2! * 2! * 3! 
        if (s[i] == '4'): 
            freq[2] += 2; 
            freq[3]+=1; 
  
        # 6! can be expressed as 5! * 3! 
        if (s[i] == '6'): 
            freq[5]+=1; 
            freq[3]+=1; 
  
        # 8! can be expressed as 7! * 2! * 2! * 2! 
  
        if (s[i] == '8'): 
            freq[7]+=1; 
            freq[2] += 3; 
  
        # 9! can be expressed as 7! * 3! * 3! * 2! 
  
        if (s[i] == '9'): 
            freq[7]+=1; 
            freq[3] += 2; 
            freq[2]+=1; 
  
    # To store the required number 
    t = ""; 
  
    # If number has only either 1 and 0 as its digits 
    if (freq[1] == number_of_digits or freq[0] == number_of_digits or (freq[0] + freq[1]) == number_of_digits): 
        return s; 
    else: 
  
        # Generate the greatest number possible 
        for i in range(9,1,-1): 
            ctr = freq[i]; 
            while (ctr>0): 
                t += chr(i + 48); 
                ctr-=1; 
  
        return t; 
  
# Driver code 
  
s = "1280"; 
print(getNumber(s)); 
  
  
# This code is contributed by mits 

