from math import ceiln,m,k,p=map(int,input().split()) if n-k<p:    print(-1)else:    an=ceil((p+k+m-1)//m)    if an*m>n:        print(-1)    else:        print(an)
