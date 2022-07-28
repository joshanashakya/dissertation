

# Python3 implementation of the approach  
  
# Function to return the minimum  
# cost to convert str1 to sr2  
def minCost(str1, str2, n):  
  
    cost = 0
  
    # For every character of str1 
    for i in range(n):  
  
        # If current character is not  
        # equal in both the strings  
        if (str1[i] != str2[i]):  
  
            # If the next character is also different in both  
            # the strings then these characters can be swapped  
            if (i < n - 1 and str1[i + 1] != str2[i + 1]):  
                swap(str1[i], str1[i + 1])  
                cost += 1
              
            # Change the current character  
            else:  
                cost += 1
              
    return cost  
  
# Driver code  
if __name__ == '__main__':  
  
    str1 = "abb"
    str2 = "bba"
    n = len(str1)  
  
    print(minCost(str1, str2, n))  
  
# This code is contributed by ashutosh450 

