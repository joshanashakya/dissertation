

# Python3 implementation to find the  
# minimum number of swaps to make  
# two strings equal  
  
# Function to find the minimum number of swaps  
# to make two strings equal  
def swapOperations(a, b, c) :  
  
    # Counting length of string  
    l = len(a);  
    i = 0;  
  
    # Initializing the answer  
    total_swaps = 0;  
  
    # For loop to iterate through the  
    # given strings  
    for i in range(l) : 
  
        # Condition if both character of  
        # string a and b are equal  
        if (a[i] == b[i]) : 
            continue;  
  
        # Condition if character of  
        # string a and c are equal  
        if (a[i] == c[i]) : 
  
            # If yes, then swap  
            # the characters  
            #swap(b[i], c[i]);  
            b[i], c[i] = c[i], b[i]; 
            total_swaps += 1;  
            continue;  
  
        # Condition if character of  
        # string b and c are equal  
        if (b[i] == c[i]) : 
  
            # If yes, then swap  
            # the characters  
            # swap(a[i], c[i]);  
            a[i], c[i] = c[i], a[i]; 
            total_swaps += 1;  
            continue;  
  
        # Else, it is impossible to make  
        # both the strings equal  
        break;  
      
    i += 1; 
  
    # Printing the answer  
    if (i == l) : 
        print(total_swaps) ;  
    else : 
        print(-1);  
  
# Driver Code  
if __name__ == "__main__" :  
  
    a = "xyz";  
    b = "yzx";  
    c = "yzx";  
  
    swapOperations(list(a), list(b), list(c));  
  
# This code is contributed by AnkitRai01 

