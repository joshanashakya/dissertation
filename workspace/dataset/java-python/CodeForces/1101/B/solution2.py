import mathsa=lambda :input()sb=lambda:int(input())sc=lambda:input().split()sd=lambda:list(map(int,input().split()))se=lambda:float(input())sf=lambda:list(input())#10101001def hnbhai():    s=sa()    o=-1    for i in range(len(s)):        if s[i]=='[':            o=i            break    c=-1    for i in range(len(s)-1,-1,-1):        if s[i]==']':            c=i            break    if c==-1 or o==-1 or o>c:        print(-1)        return    d1=-1    for i in range(o,c):        if s[i]==":":            d1=i            break    for i in range(c-1,o,-1):        if s[i]==":":            d2=i            break    if d1==-1 or d2==-1 or d1==d2:        print(-1)        return    t=0    for i in range(d1,d2):        if s[i]=="|":            t+=1    print(t+4)#for _ in range(sb()):hnbhai()        
