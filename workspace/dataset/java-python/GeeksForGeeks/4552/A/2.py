

# Python program to print all distinct  
# subsequences of a string. 
  
# Finds and stores result in st for a given 
# string s. 
def generate(st, s): 
    if len(s) == 0: 
        return
  
    # If current string is not already present. 
    if s not in st: 
        st.add(s) 
  
        # Traverse current string, one by one 
        # remove every character and recur. 
        for i in range(len(s)): 
            t = list(s).copy() 
            t.remove(s[i]) 
            t = ''.join(t) 
            generate(st, t) 
  
    return
  
  
# Driver Code 
if __name__ == "__main__": 
    s = "xyz"
    st = set() 
    generate(st, s) 
    for i in st: 
        print(i) 
  
# This code is contributed by 
# sanjeev2552 

