k=int(input())mod=10**9+7f=[0]*(10**6+1)f[0]=f[1]=1for i in range(2,10**6+1):  f[i]=(f[i-1]*i)%moddef comb(n,r):  return (f[n]*pow(f[r],mod-2,mod)*pow(f[n-r],mod-2,mod))%modans=1cc=int(input())for i in range(1,k):  c=int(input())  cc+=c  ans*=comb(cc-1,c-1)  ans%=modprint(ans)