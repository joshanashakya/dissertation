n,m = map(int,input().split())ans = [0]*(n+10)mx = list(range(n+10)) def find(st):    if mx[st]!=st:        mx[st] = find(mx[st])    return mx[st]  for _ in range(m):    l,r,x = map(int,input().split())    xt = find(l)    while xt<x:        if xt!=x:            ans[xt] =x            mx[xt] = x        xt = find(xt+1)    xt = find(x+1)    while xt<=r:        if xt!=x:            ans[xt]=x            mx[xt] = r+1        xt = find(xt+1)print(*ans[1:n+1])    