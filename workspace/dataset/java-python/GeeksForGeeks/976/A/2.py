

# Python3 implementation of the approach  
import math 
  
# Function that returns the modified  
# lexicographically smallest string after  
# performing minimum number of given operations  
def formStringMinOperations(ss): 
      
    # Stores the initial frequencies of  
    # characters 0s, 1s and 2s  
    count = [0] * 3; 
    s = list(ss); 
    for i in range(len(s)):  
        count[ord(s[i]) - ord('0')] += 1;  
  
    # Stores number of processed characters  
    # upto that point of each type  
    processed = [0] * 3;  
  
    # Required number of characters of each type  
    reqd = math.floor(len(s) / 3);  
    for i in range(len(s)):  
  
        # If the current type has already reqd  
        # number of characters, no need to  
        # perform any operation  
        if (count[ord(s[i]) - ord('0')] == reqd):  
            continue;  
  
        # Process all 3 cases  
        if (s[i] == '0' and count[0] > reqd and
                            processed[0] >= reqd): 
  
            # Check for 1 first  
            if (count[1] < reqd): 
                s[i] = '1';  
                count[1] += 1;  
                count[0] -= 1;  
  
            # Else 2  
            elif (count[2] < reqd):  
                s[i] = '2';  
                count[2] += 1;  
                count[0] -= 1;  
  
        # Here we need to check processed[1] only  
        # for 2 since 0 is less than 1 and we can  
        # replace it anytime  
        if (s[i] == '1' and count[1] > reqd): 
            if (count[0] < reqd): 
                s[i] = '0';  
                count[0] += 1;  
                count[1] -= 1;  
            elif (count[2] < reqd and 
                  processed[1] >= reqd): 
                s[i] = '2';  
                count[2] += 1;  
                count[1] -= 1;  
  
        # Here we can replace 2 with 0 and 1 anytime  
        if (s[i] == '2' and count[2] > reqd): 
            if (count[0] < reqd): 
                s[i] = '0';  
                count[0] += 1;  
                count[2] -= 1;  
            elif (count[1] < reqd): 
                s[i] = '1';  
                count[1] += 1;  
                count[2] -= 1;  
  
        # keep count of processed characters  
        # of each type  
        processed[ord(s[i]) - ord('0')] += 1;  
    return ''.join(s);  
  
# Driver Code  
s = "011200";  
print(formStringMinOperations(s));  
  
# This code is contributed by mits 

