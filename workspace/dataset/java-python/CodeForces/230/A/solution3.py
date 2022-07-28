a=lambda:map(int,input().split())s,n=a()g=0l=[]for i in ' '*n:    l.append((list(a())))l.sort()for i in range(n):    if l[i][0]<s:s+=l[i][1]    else: g=1print(['YES','NO'][g==1])
