

# Python3 program to check if one  
# number is a power of other  
def isGreaterThanEqualTo(s1, s2):  
  
    if len(s1) > len(s2):  
        return True
  
    return s1 == s2  
  
def multiply(s1, s2):  
  
    n, m = len(s1), len(s2) 
    result = [0] * (n + m)  
  
    # Multiply the numbers. It multiplies  
    # each digit of second string to each  
    # digit of first and stores the result.  
    for i in range(n - 1, -1, -1):  
        for j in range(m - 1, -1, -1):  
            result[i + j + 1] += (int(s1[i]) * 
                                  int(s2[j])) 
  
    # If the digit exceeds 9, add the  
    # cumulative carry to previous digit.  
    size = len(result)  
    for i in range(size - 1, 0, -1):  
        if result[i] >= 10:  
            result[i - 1] += result[i] // 10
            result[i] = result[i] % 10
  
    i = 0
    while i < size and result[i] == 0:  
        i += 1
  
    # If all zeroes, return "0".  
    if i == size:  
        return "0"
  
    temp = ""  
      
    # Remove starting zeroes.  
    while i < size:  
        temp += str(result[i])  
        i += 1
      
    return temp  
  
# Removes Extra zeroes from front of a string.  
def removeLeadingZeores(s):  
  
    n, i = len(s), 0
  
    while i < n and s[i] == '0':  
        i += 1
  
    if i == n:  
        return "0"
  
    temp = ""  
    while i < n:  
        temp += s[i] 
        i += 1
          
    return temp  
  
def isPower(s1, s2):  
  
    # Make sure there are no leading  
    # zeroes in the string.  
    s1 = removeLeadingZeores(s1)  
    s2 = removeLeadingZeores(s2)  
  
    if s1 == "0" or s2 == "0":  
        return False
  
    if s1 == "1" and s2 == "1":  
        return True
  
    if s1 == "1" and s2 == "1":  
        return True
  
    # Making sure that s1 is smaller.  
    # If it is greater, we recur we  
    # reversed parameters.  
    if len(s1) > len(s2):  
        return isPower(s2, s1)  
  
    temp = s1  
    while not isGreaterThanEqualTo(s1, s2):  
        s1 = multiply(s1, temp)  
  
    return s1 == s2  
  
# Driver Code 
if __name__ == "__main__": 
  
    s1, s2 = "374747", "52627712618930723"
    if isPower(s1, s2): 
        print("YES") 
    else: 
        print("NO") 
          
    s1, s2 = "4099", "2"
    if isPower(s1, s2): 
        print("YES") 
    else: 
        print("NO") 
      
# This code is contributed by Rituraj Jain 

