

# Python3 implemenattion of the above approach 
  
# Function to find the partition of the 
# string such that both parts have at 
# least k different characters 
def division_of_string(string, k) : 
      
    # Length of the string 
    n = len(string); 
  
    # To check if the current  
    # character is already found 
    has = {}; 
  
    cnt = 0; i = 0; 
  
    # Count number of different 
    # characters in the left part 
    while (i < n) : 
  
        # If current character is not  
        # already found, increase cnt by 1 
        if string[i] not in has : 
            cnt += 1; 
            has[string[i]] = True; 
  
        # If count becomes equal to k, we've  
        # got the first part, therefore, 
        # store current index and break the loop 
        if (cnt == k) : 
            ans = i; 
            break; 
  
        i += 1; 
  
    # Clear the map 
    has.clear(); 
  
    # Assign cnt as 0 
    cnt = 0; 
  
    while (i < n) : 
  
        # If the current character is not  
        # already found, increase cnt by 1 
        if (string[i] not in has) : 
            cnt += 1; 
            has[string[i]] = True; 
  
        # If cnt becomes equal to k, the 
        # second part also have k different 
        # characters so break it 
        if (cnt == k) : 
            break; 
  
        i += 1; 
  
    # If the second part has less than 
    # k different characters, then  
    # print "Not Possible" 
    if (cnt < k) : 
        print("Not possible",end = ""); 
  
    # Otherwise print both parts 
    else : 
        i = 0; 
        while (i <= ans) : 
            print(string[i],end= ""); 
            i += 1; 
      
        print(); 
  
        while (i < n) : 
            print(string[i],end=""); 
            i += 1; 
              
        print() 
  
# Driver code 
if __name__ == "__main__": 
  
    string = "geeksforgeeks"; 
    k = 4; 
  
    # Function call 
    division_of_string(string, k); 
  
# This code is contributed by AnkitRai01 

