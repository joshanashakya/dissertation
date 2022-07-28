

# Python3 program to find number of substrings 
# of length k whose sum of ASCII value of  
# characters is divisible by k  
  
def count(s, k): 
      
    # Finding length of string 
    n = len(s)  
    d, count = 0, 0
    for i in range(k):  
          
        # finding sum of ASCII value of first  
        # substring 
        d += ord(s[i]) 
        if (d % k == 0): 
            count += 1
            for i in range(k, n): 
                  
                # Using sliding window technique to  
                # find sum of ASCII value of rest of  
                # the substring 
                prev = ord(s[i-k]) 
                d -= prev 
                d += ord(s[i]) 
                  
                # checking if sum is divisible by k 
                if (d % k == 0): 
                    count += 1
                    return count 
# Driver code 
s = "bcgabc"
k = 3
ans = count(s, k)  
print(ans)  

