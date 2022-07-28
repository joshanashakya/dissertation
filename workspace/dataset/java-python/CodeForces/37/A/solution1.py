n=int(input())m=list(map(int,input().split()))high=0x=[]for i in range(n):    if m[i] not in x:        x.append(m[i])    if m.count(m[i])>high:        high=m.count(m[i])print(high,len(x))
