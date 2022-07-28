

# Simple Python3 program to find pairs with  
# distance equal to English alphabet distance  
  
# Function to count pairs  
def countPairs(str1): 
    result = 0;  
    n = len(str1)  
    for i in range(0, n): 
        for j in range(i + 1, n):  
  
            # Increment count if characters  
            # are at same distance  
            if (abs(ord(str1[i]) - 
                    ord(str1[j])) == abs(i - j)):  
                result += 1;  
  
    return result;  
  
# Driver code  
if __name__ == "__main__":  
    str1 = "geeksforgeeks";  
    print(countPairs(str1));  
  
# This code is contributed  
# by Sairahul099 

