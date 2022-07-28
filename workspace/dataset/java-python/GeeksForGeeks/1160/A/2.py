

# Python implementation of the above approach 
  
s = "ABCDEFGHI"
  
# converting String to a list 
S = list(s)   
  
 # All vowels 
x = ["A", "E", "I", "O", "U"]  
  
 # List to store distinct vowels 
y = []  
le = len(S) 
if (le < 5): 
    # if length of string is less than 5 then always 
    # Impossible 
    print("Impossible") 
else: 
    # Storing the distinct vowels in the string 
    # by checking if it in the list of string and not 
    # in the list of distinct vowels 
    for i in range(le): 
        if (S[i] in x and S[i] not in y): 
            y.append(S[i]) 
  
    # Storing the vowels which are not present in the string 
    z = [] 
    for i in range(5): 
        if (x[i] not in y): 
            z.append(x[i]) 
    if (len(z) == 0): 
        # No replacement needed condition 
        print(s) 
    else: 
        cc = 0
        y = [] 
  
        # Replacing the characters to get all Vowels 
        for i in range(le): 
            if (S[i] in x and S[i] not in y): 
                y.append(S[i]) 
            else: 
                S[i] = z[cc] 
                cc += 1
            if (cc == len(z)): 
                break
        print(*S, sep ="") 

