

# Python3 program to find first substring  
  
# Function to find first substring  
def first_substring(s) :  
  
    n = len(s); c = 0;  
    mpp = {};  
  
    # Storing the words present in string  
    for i in range(n) : 
        if (s[i] == ' ' or s[i] == '#') : 
            s1 = s[c: i];  
            mpp[s1] = 1;  
            c = i + 1; 
  
    # Calculating for all  
    # possible valid substring.  
    for i in range(n) : 
        if (s[i] == ' ') : 
            continue;  
          
        for j in range(n) :  
            if (s[j] == ' ') : 
                break;  
              
            s1 = s[i : j + 1];  
            s2 = s1;  
            s1 = s1[::-1]; 
              
            if s1 in mpp : 
                if mpp[s1] : 
                    return s2;  
      
    return "-1";  
  
# Driver code  
if __name__ == "__main__" :  
  
    s = "mango is sweet when nam en tastes it#";  
    s1 = first_substring(s);  
    print(s1);  
  
# This code is contributed by AnkitRai01 

