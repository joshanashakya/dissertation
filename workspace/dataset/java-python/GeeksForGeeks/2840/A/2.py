

# Python3 implementation of the approach  
  
# Function to return the factorial of n  
def fact(n) :  
  
    fact = 1;  
    for i in range(1, n + 1) : 
        fact *= i;  
  
    return fact;  
  
# Function to return the count of all  
# possible strings that can be formed  
# with the characters of the given string  
# without repeating characters  
def countStrings(string, n) :  
  
    # To store the distinct characters  
    # of the string str  
    distinct_char = set();  
    for i in range(n) :  
        distinct_char.add(string[i]);  
      
    return fact(len(distinct_char));  
  
# Driver code  
if __name__ == "__main__" :  
  
    string = "geeksforgeeks";  
    n = len(string);  
  
    print(countStrings(string, n));  
  
# This code is contributed by AnkitRai01 

