# A. Epic Gamedef gcd(x,y):    for i in range(1,min(x,y)+1):        if x%i==0 and y%i==0:            gcd=i    return gcda,b,temp=map(int,input().split())chance=0while temp>=1:       if chance==0 :        g=gcd(a,temp)        if g>temp:            w=1        else:            temp-=g        chance=1    else:        g=gcd(b,temp)        if g>temp:            w=0        else:            temp-=g        chance=0    print(abs(1-chance))
