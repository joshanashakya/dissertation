mod = 1000000000+7n,k = map(int,input().split())a = list(map(int,input().split()))b = list(map(int,input().split()))blo = n//kans=1for i in range(blo):    cnt= (10**k -1)//a[i] - (10**(k-1)*(b[i]+1)-1)//a[i]    if b[i]>0:        cnt+=(10**(k-1)*b[i]-1)//a[i] + 1    ans = (ans*cnt)%modprint(ans)        