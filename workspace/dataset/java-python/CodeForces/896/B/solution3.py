import sys n, m, c=map(int, input().split())a=[]for i in range(n+1):    a.append(0)cnt=0while cnt<n:    i=0    x=int(input())    if x*2<=c:        i=1        while a[i] and a[i]<=x:            i+=1    else:        i=n        while a[i] and a[i]>=x:            i-=1    if a[i]==0:        cnt+=1    a[i]=x    print(i)    sys.stdout.flush()    
