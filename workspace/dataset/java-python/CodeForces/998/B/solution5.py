n,bt = map(int,input().split())arr = list(map(int,input().split())) s = 0b = []for i in range(n-1):    s+= (1-2*(arr[i]&1))    if s==0:        b.append(abs(arr[i]-arr[i+1])) b.sort()ans = 0i = 0while i<len(b):    if b[i]<=bt:        bt-=b[i]        ans+=1    else:        break    i+=1print(ans)