import mathk,a,b,v = map(int,input().split())ans = 0while a > 0:    l = min(k-1,b)    b-=l    a-= (l+1)*v    ans+=1print(ans)
