from math import logl, r, k = map(int, input().split())temp = int(log(l, k))val = k**tempif(val<l):val*=kc=0while(val<=r):    print(val, end=" ")    val*=k    c+=1if not c:print(-1)    
