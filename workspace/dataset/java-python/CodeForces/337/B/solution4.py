import mathn,k,l,m = map(int,input().split())k=k*lm=m*na=abs(k-m)b=max(k,m)x=math.gcd(a,b)a//=xb//=xprint(str(a)+"/"+str(b))
