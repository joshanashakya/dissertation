s="NO"n, a, x, b, y=map(int, input().split())while a!=x and b!=y:    a+=1    b-=1    if a>n:        a=1    if b<1:        b=n    if a==b:        s="YES"        breakprint(s)
