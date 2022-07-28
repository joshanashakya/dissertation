from  math import gcd,sqrtn=int(input());ans=0;sett=set() for i in range(3,n+1):  for j in range(i,n+1):    k=i**2+j**2    if int(sqrt(k))==sqrt(k) and sqrt(k)<=n:ans+=1print(ans)
