l, r, a = map(int,input().split())while a>0:    if l<r:        l=l+1    else:        r =r +1    a=a-1print(min(l,r)*2)
