start,end = map(int,input().split())t,d = map(int,input().split())ans = 0for i in range(t):    if start>end:        start,end = end,start    ans+=start    start+=dprint(ans)
