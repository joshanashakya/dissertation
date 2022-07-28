for _ in range(int(input())):    n=int(input())    s=input()    m=n-1    for i in range(n):        if s[i]=='>' or s[n-1-i]=='<':            m=min(m,i)    print(m)
