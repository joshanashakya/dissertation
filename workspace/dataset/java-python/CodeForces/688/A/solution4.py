m,n=map(int,input().split())k=0x=0while n >0:    l=input()    if l.count('1') != len(l):        x=x+1    else:        k=max(k,x)        x=0    n=n-1k=max(k,x)          print(k)    
