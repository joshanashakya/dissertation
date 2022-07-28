

# Python3 implementation of the approach  
  
# Function to return the string after  
# reversing characters in the range [L, R]  
def reverse(string, length, l, r) : 
  
    # Invalid range  
    if (l < 0 or r >= length or l > r) : 
        return string; 
          
    string = list(string) 
      
    # While there are characters to swap  
    while (l < r) : 
  
        # Swap(str[l], str[r])  
        c = string[l];  
        string[l] = string[r];  
        string[r] = c;  
  
        l += 1;  
        r -= 1;  
  
    return "".join(string);  
  
# Driver code  
if __name__ == "__main__" :  
  
    string = "geeksforgeeks";  
    length = len(string);  
    l = 5; r = 7;  
  
    print(reverse(string, length, l, r));  
  
# This code is contributed by AnkitRai01 

