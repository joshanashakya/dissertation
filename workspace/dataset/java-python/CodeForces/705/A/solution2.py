n=int(input())f=1s=""for i in range(n-1):    if f==1:        s+="I hate"        f=2    else:        s+="I love"        f=1    s+=" that "if f==1 :    s+="I hate it"else:    s+="I love it"print(s)    
