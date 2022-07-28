from  math import gcd,sqrtn=int(input());ans=0for i in range(5,n+1):  for j in range(1,i):    k=i**2-j**2    if int(sqrt(k))==sqrt(k):ans+=1print(ans//2)
