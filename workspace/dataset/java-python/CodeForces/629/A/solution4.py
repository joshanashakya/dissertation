n = int(input())cke=[]for i in range(n):    a=[]    s = input()    for j in range(n):        a.append(s[j])    cke.append(a)c=0for i in range(n):    for j in range(n):        if cke[i][j]=='C':            for k in range(j+1,n):                if cke[i][k]=='C':                    c += 1            for k in range(i+1,n):                if cke[k][j]=='C':                    c += 1 print(c)