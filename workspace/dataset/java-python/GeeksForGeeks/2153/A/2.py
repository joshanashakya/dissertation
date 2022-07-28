

# Python 3 program to count the number of substrings 
# divisible by 4. 
  
def countDivisbleby4(s): 
    n = len(s) 
      
    # In the first loop we will count number of  
    # 0's, 4's and 8's present in the string 
    count = 0; 
    for i in range(0,n,1): 
        if (s[i] == '4' or s[i] == '8' or s[i] == '0'): 
            count += 1
      
    # In second loop we will convert pairs 
    # of two consecutive characters into 
    # integer and store it in variable h . 
    # Then we check whether h is divisible by 4 
    # or not . If h is divisible we increases 
    # the count with ( i + 1 ) as index of 
    # first character of pair 
    for i in range(0,n - 1,1): 
        h = (ord(s[i]) - ord('0')) * 10 + (ord(s[i+1]) - ord('0'))  
        if (h % 4 == 0): 
            count = count + i + 1
      
    return count 
  
# Driver code to test above function 
if __name__ == '__main__': 
    s = ['1','2','4'] 
    print(countDivisbleby4(s)) 
  
# This code is contributed by 
# Surendra_Gangwar 

