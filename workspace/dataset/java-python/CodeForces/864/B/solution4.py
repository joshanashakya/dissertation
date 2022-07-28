n=int(input())s=input()ss=set()b=0for i in range(n):    if s[i]>="a" and s[i]<="z":        ss.add(s[i])    else:        b=max(b,len(ss))        ss=set()b=max(b,len(ss))print(b)
