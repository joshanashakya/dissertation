n = int(input())m=list(map(int,input().split()))gc=m[0]import mathfor i in range(1,n):    gc=math.gcd(gc,m[i])k=max(m)prime=[0]*(k+1)pfac=[0]*(k+1)for i in range(2,k+1):    if prime[i]==0:        for j in range(i*i,k+1,i):            prime[j]=ifor i in range(1,k+1):    if not prime[i]:        prime[i]=ifor i in range(n):    v=m[i]//gc    while v>1:        fac=prime[v]        pfac[fac]+=1        while v%fac==0:            v//=facma=0ma=max(pfac)if ma:    print(n-ma)else:    print(-1)                