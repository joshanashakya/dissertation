def gcd(a,b):    if b==0:        return a    return gcd(b,a%b)n = int(input())l = list(map(int,input().split()))c = 0f = 0if 1 in l:    print(n-l.count(1))else:    while True:        c+=1        for i in range(n-c):            a = gcd(l[i],l[i+1])            if a==1:                f = 1                break            l[i] = a        if f==1:            break        if c==n:            break    if f==0:        print(-1)    else:        print(c+n-1)
