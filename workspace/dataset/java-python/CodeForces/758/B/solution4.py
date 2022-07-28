s = input()t = [0]*4d = {}for i,c in enumerate(s):    if c=="!":        t[i%4]+=1    else:        d[c] = i%4for c in "RBYG":    print(t[d[c]],end=" ")    
