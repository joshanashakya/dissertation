import math k,a,b,v = map(int,input().split())    ans = 0 while a > 0:     l = min(k-1,b)     b-=l    a-= (l+1)*v     ans+=1 print(ans)
