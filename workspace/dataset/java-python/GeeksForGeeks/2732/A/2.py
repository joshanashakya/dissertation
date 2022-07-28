

# Python3 implementation of the above approach  
  
# Function to find Longest prefix string with the  
# highest frequency  
def prefix(string) : 
  
    k = 1;  
    n = len(string);  
  
    g = [];  
    flag = 0;  
  
    # storing all indices where first element is found  
    for i in range(1, n) : 
        if (string[i] == string[0]) : 
            g.append(i);  
            flag = 1;  
  
    # if the first letter in the string does not occur  
    # again then answer will be the whole string  
    if (flag == 0) : 
        print(string);  
       
    else : 
        length = len(g); 
          
        # loop till second appearance of the first element 
        while (k < g[0]) : 
            cnt = 0; 
              
            for j in range(length) : 
                  
                # check one letter after every stored index 
                if (string[g[j] + k] == string[k]) : 
                    cnt += 1; 
                      
            # If there is no mismatch we move forward 
            if (cnt == len) : 
                k += 1; 
             
            # otherwise we stop 
            else : 
                break; 
         
        for i in range(k+1) : 
            print(string[i],end=""); 
         
        print()  
  
# Driver Code  
if __name__ == "__main__" :  
  
    string = "abcab";  
    prefix(string);  
  
# This code is contributed by AnkitRai01 

