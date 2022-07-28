

# Python3 program to print the smallest 
# integer not less than N with all even digits 
  
# Function to return the answer when the 
# first odd digit is 9 
def trickyCase(s, index): 
    index1 = -1; 
  
    # traverse towwars the left to find  
    # the non-8 digit 
    for i in range(index - 1, -1, -1):  
  
        # index digit 
        digit = s[i] - '0'; 
  
        # if digit is not 8, then break 
        if (digit != 8): 
            index1 = i; 
            break; 
      
    # if on the left side of the '9',  
    # no 8 is found then we return by  
    # adding a 2 and 0's 
    if (index1 == -1): 
        return 2 * pow(10, len(s)); 
  
    num = 0; 
  
    # till non-8 digit add all numbers 
    for i in range(index1): 
        num = num * 10 + (s[i] - '0'); 
  
    # if non-8 is even or odd  
    # than add the next even. 
    if (s[index1] % 2 == 0): 
        num = num * 10 + (s[index1] - '0' + 2); 
    else: 
        num = num * 10 + (s[index1] - '0' + 1); 
  
    # add 0 to right of 9 
    for i in range(index1 + 1, len(s)): 
        num = num * 10; 
  
    return num; 
  
# function to return the smallest  
# number with all digits even 
def smallestNumber(n): 
  
    num = 0; 
    s = ""; 
  
    duplicate = n; 
      
    # convert the number to string to  
    # perform operations 
    while (n):  
        s = chr(n % 10 + 48) + s; 
        n = int(n / 10); 
  
    index = -1; 
  
    # find out the first odd number 
    for i in range(len(s)): 
        digit = ord(s[i]) - ord('0'); 
        if (digit & 1): 
            index = i; 
            break; 
  
    # if no odd numbers are 
    # there, than n is the answer 
    if (index == -1): 
        return duplicate; 
  
    # if the odd number is 9, than  
    # tricky case handles it 
    if (s[index] == '9'): 
        num = trickyCase(s, index); 
        return num; 
  
    # add all digits till first odd 
    for i in range(index): 
        num = num * 10 + ord(s[i]) - ord('0'); 
  
    # increase the odd digit by 1 
    num = num * 10 + (ord(s[index]) - 
                      ord('0') + 1); 
  
    # add 0 to the right of the odd number 
    for i in range(index + 1, len(s)): 
        num = num * 10; 
  
    return num; 
  
# Driver Code 
N = 2397; 
print(smallestNumber(N)); 
  
# This code is contributed 
# by mits 

