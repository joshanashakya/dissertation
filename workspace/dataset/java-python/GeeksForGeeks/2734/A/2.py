

# Python3 implementation of the approach  
  
# Function to return the count of distinct  
# characters in all the distinct  
# sub-strings of the given string  
def countTotalDistinct(string) :  
  
    cnt = 0;  
  
    # To store all the sub-strings  
    items = set();  
  
    for i in range(len(string)) : 
  
        # To store the current sub-string  
        temp = "";  
  
        # To store the characters of the  
        # current sub-string  
        ans = set();  
        for j in range(i, len(string)) : 
            temp = temp + string[j];  
            ans.add(string[j]);  
  
            # If current sub-string hasn't  
            # been stored before  
            if temp not in items : 
  
                # Insert it into the set  
                items.add(temp);  
  
                # Update the count of  
                # distinct characters  
                cnt += len(ans);  
  
    return cnt;  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    string = "ABCA";  
  
    print(countTotalDistinct(string));  
      
# This code is contributed by AnkitRai01 

